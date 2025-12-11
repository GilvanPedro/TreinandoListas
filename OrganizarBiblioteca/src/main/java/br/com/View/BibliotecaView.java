package br.com.View;

import br.com.Controller.BibliotecaController;
import br.com.Entity.Biblioteca;

import javax.swing.*;
import java.awt.*;

public class BibliotecaView extends JFrame {

    private BibliotecaController controller = new BibliotecaController();

    private JTextField tituloField;
    private JTextField autorField;
    private JTextField generoField;

    private JTextArea areaLista;
    private JComboBox<String> comboOrdenar;

    public BibliotecaView() {
        setTitle("Biblioteca - Sistema de Livros");
        setSize(500, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblTitulo = new JLabel("Título:");
        lblTitulo.setBounds(20, 20, 80, 25);
        add(lblTitulo);

        tituloField = new JTextField();
        tituloField.setBounds(100, 20, 350, 25);
        add(tituloField);

        JLabel lblAutor = new JLabel("Autor:");
        lblAutor.setBounds(20, 60, 80, 25);
        add(lblAutor);

        autorField = new JTextField();
        autorField.setBounds(100, 60, 350, 25);
        add(autorField);

        JLabel lblGenero = new JLabel("Gênero:");
        lblGenero.setBounds(20, 100, 80, 25);
        add(lblGenero);

        generoField = new JTextField();
        generoField.setBounds(100, 100, 350, 25);
        add(generoField);

        JButton btnAdicionar = new JButton("Adicionar");
        btnAdicionar.setBounds(20, 140, 430, 30);
        add(btnAdicionar);

        comboOrdenar = new JComboBox<>(new String[]{"Título", "Autor", "Gênero"});
        comboOrdenar.setBounds(20, 180, 200, 25);
        add(comboOrdenar);

        JButton btnMostrar = new JButton("Mostrar Livros");
        btnMostrar.setBounds(230, 180, 220, 25);
        add(btnMostrar);

        areaLista = new JTextArea();
        areaLista.setEditable(false);

        JScrollPane scroll = new JScrollPane(areaLista);
        scroll.setBounds(20, 220, 430, 170);
        add(scroll);

        // === Ações dos botões ===

        btnAdicionar.addActionListener(e -> {
            String titulo = tituloField.getText();
            String autor = autorField.getText();
            String genero = generoField.getText();

            if(titulo.isEmpty() || autor.isEmpty() || genero.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
                return;
            }

            controller.adicionarLivro(titulo, autor, genero);
            JOptionPane.showMessageDialog(this, "Livro adicionado!");
            tituloField.setText("");
            autorField.setText("");
            generoField.setText("");
        });

        btnMostrar.addActionListener(e -> {
            int opcao = comboOrdenar.getSelectedIndex() + 1; // 1, 2 ou 3
            controller.ordenarLivros(opcao);

            areaLista.setText("");

            for (Biblioteca b : controller.listaLivros) {
                areaLista.append("Título: " + b.getTitulo() +
                        " | Autor: " + b.getAutor() +
                        " | Gênero: " + b.getGenero() + "\n");
            }
        });
    }

    public static void main(String[] args) {
        new BibliotecaView().setVisible(true);
    }
}
