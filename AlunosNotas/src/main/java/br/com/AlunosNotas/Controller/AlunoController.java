package br.com.AlunosNotas.Controller;

import br.com.AlunosNotas.Entity.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoController {

    List<Aluno> alunos =  new ArrayList<>();


    public void adicionarAluno(String nome, double nota1, double nota2, double nota3, double nota4) {
        Aluno aluno = new Aluno(gerarId(), nome, nota1, nota2, nota3, nota4);
        alunos.add(aluno);
    }

    public void mostrarAluno() {
        if(alunos.isEmpty()) {
            System.out.println("\nNenhum aluno cadastrado!");
            return;
        } else{
            System.out.println("============================= Alunos =============================");
            for (Aluno aluno : alunos) {
                System.out.println("Aluno "+ aluno.getId() + ": " + aluno.getNome() + "| N1: " + aluno.getNota1()+ "| N2: " + aluno.getNota2()+ "| N3: " + aluno.getNota3()+ "| N4: " + aluno.getNota4() + "| Média: " + calcularMedia(aluno.getNota1(), aluno.getNota2(), aluno.getNota3(), aluno.getNota4()));
            }
        }
        System.out.println();
    }

    public boolean excluirAluno(long id) {
        for (Aluno aluno : alunos) {
            if (aluno.getId() == id) {
                alunos.remove(aluno);
                return true;
            }
        }
        return false;
    }


    public double calcularMedia(double nota1, double nota2, double nota3, double nota4) {

        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    public long gerarId(){

        return alunos.size()+1;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
}
