package br.com.Controller;

import br.com.Entity.Biblioteca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BibliotecaController {
    public List<Biblioteca> listaLivros = new ArrayList<Biblioteca>();

    public void adicionarLivro(String nome, String autor, String genero){
        Biblioteca biblioteca = new Biblioteca(nome, autor, genero);
        listaLivros.add(biblioteca);
    }

    public void mostrarLivro(){
        System.out.println("\n=================== Lista de Livros ===================");
        for(Biblioteca biblioteca : listaLivros){
            System.out.println("Título: " + biblioteca.getTitulo() + " | Autor: " + biblioteca.getAutor() + " | Genero: " + biblioteca.getGenero());
        }
        System.out.println();
    }

    public void ordenarLivros(int opcao) {
        switch (opcao) {
            case 1: // Ordenar por título
                listaLivros.sort(Comparator.comparing(
                        Biblioteca::getTitulo, String.CASE_INSENSITIVE_ORDER));
                break;

            case 2: // Ordenar por autor
                listaLivros.sort(Comparator.comparing(
                        Biblioteca::getAutor, String.CASE_INSENSITIVE_ORDER));
                break;

            case 3: // Ordenar por gênero
                listaLivros.sort(Comparator.comparing(
                        Biblioteca::getGenero, String.CASE_INSENSITIVE_ORDER));
                break;

            default:
                System.out.println("Opção inválida!");
        }
    }
}
