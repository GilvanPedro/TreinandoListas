package br.com.AlunosNotas.View;

import br.com.AlunosNotas.Controller.AlunoController;
import br.com.AlunosNotas.Entity.Aluno;

import javax.swing.*;
import java.awt.*;

public class AlunoView extends JFrame {

    private AlunoController controller = new AlunoController();

    private JTextField nomeField, nota1Field, nota2Field, nota3Field, nota4Field, excluirField;
    private JTextArea areaLista;

    public AlunoView() {
        setTitle("Gerenciador de Alunos");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // ------------------ TÍTULO ------------------
        JLabel lblTitulo = new JLabel("Cadastro de Alunos", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 22));
        lblTitulo.setBounds(0, 10, getWidth(), 30); // Centralizado automaticamente
        add(lblTitulo);

        int xLabel = 80;
        int xField = 170;

        // ------------------ CAMPOS ------------------
        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(xLabel, 60, 100, 20);
        add(lblNome);

        nomeField = new JTextField();
        nomeField.setBounds(xField, 60, 200, 20);
        add(nomeField);

        JLabel lblN1 = new JLabel("Nota 1:");
        lblN1.setBounds(xLabel, 100, 100, 20);
        add(lblN1);

        nota1Field = new JTextField();
        nota1Field.setBounds(xField, 100, 80, 20);
        add(nota1Field);

        JLabel lblN2 = new JLabel("Nota 2:");
        lblN2.setBounds(xLabel, 130, 100, 20);
        add(lblN2);

        nota2Field = new JTextField();
        nota2Field.setBounds(xField, 130, 80, 20);
        add(nota2Field);

        JLabel lblN3 = new JLabel("Nota 3:");
        lblN3.setBounds(xLabel, 160, 100, 20);
        add(lblN3);

        nota3Field = new JTextField();
        nota3Field.setBounds(xField, 160, 80, 20);
        add(nota3Field);

        JLabel lblN4 = new JLabel("Nota 4:");
        lblN4.setBounds(xLabel, 190, 100, 20);
        add(lblN4);

        nota4Field = new JTextField();
        nota4Field.setBounds(xField, 190, 80, 20);
        add(nota4Field);

        // ------------------ BOTÃO ADICIONAR ------------------
        JButton btnAdicionar = new JButton("Adicionar");
        btnAdicionar.setBounds((getWidth() - 150) / 2, 230, 150, 30);
        add(btnAdicionar);

        btnAdicionar.addActionListener(e -> adicionarAluno());

        // ------------------ ÁREA DE LISTA ------------------
        areaLista = new JTextArea();
        areaLista.setEditable(false);

        JScrollPane scroll = new JScrollPane(areaLista);
        scroll.setBounds(20, 280, 440, 180);
        add(scroll);

        // ------------------ EXCLUIR ------------------
        JLabel lblExcluir = new JLabel("Excluir ID:");
        lblExcluir.setBounds(20, 480, 100, 20);
        add(lblExcluir);

        excluirField = new JTextField();
        excluirField.setBounds(120, 480, 80, 20);
        add(excluirField);

        JButton btnExcluir = new JButton("Excluir");
        btnExcluir.setBounds(210, 475, 100, 30);
        add(btnExcluir);

        btnExcluir.addActionListener(e -> excluirAluno());

        // ------------------ LISTAR ------------------
        JButton btnListar = new JButton("Listar Alunos");
        btnListar.setBounds(320, 475, 130, 30);
        add(btnListar);

        btnListar.addActionListener(e -> listarAlunos());

        setLocationRelativeTo(null); // Centraliza a janela na tela
    }

    // ------------------ MÉTODOS ------------------

    private void adicionarAluno() {
        try {
            String nome = nomeField.getText().trim();
            double n1 = Double.parseDouble(nota1Field.getText());
            double n2 = Double.parseDouble(nota2Field.getText());
            double n3 = Double.parseDouble(nota3Field.getText());
            double n4 = Double.parseDouble(nota4Field.getText());

            controller.adicionarAluno(nome, n1, n2, n3, n4);

            JOptionPane.showMessageDialog(this, "Aluno adicionado!");

            nomeField.setText("");
            nota1Field.setText("");
            nota2Field.setText("");
            nota3Field.setText("");
            nota4Field.setText("");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos corretamente!");
        }
    }

    private void listarAlunos() {
        StringBuilder sb = new StringBuilder();

        if (controller.getAlunos().isEmpty()) {
            sb.append("Nenhum aluno cadastrado.");
        } else {
            for (Aluno aluno : controller.getAlunos()) {
                sb.append("ID: ").append(aluno.getId()).append(" | Nome: ").append(aluno.getNome()).append(" | Notas: [").append(aluno.getNota1()).append(", ").append(aluno.getNota2()).append(", ").append(aluno.getNota3()).append(", ").append(aluno.getNota4()).append("] | Média: ").append(controller.calcularMedia(aluno.getNota1(), aluno.getNota2(), aluno.getNota3(), aluno.getNota4())).append("\n");
            }
        }

        areaLista.setText(sb.toString());
    }

    private void excluirAluno() {
        try {
            long id = Long.parseLong(excluirField.getText());

            if (controller.excluirAluno(id)) {
                JOptionPane.showMessageDialog(this, "Aluno excluído!");
            } else {
                JOptionPane.showMessageDialog(this, "ID não encontrado!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Digite um ID válido!");
        }
    }
}
