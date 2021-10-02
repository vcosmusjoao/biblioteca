package br.com.letscode.java.biblioteca;

import br.com.letscode.java.biblioteca.livro.Livro;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> livros = new ArrayList<>();
    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    public List<Livro> listarLivros(){
        return livros;
    }

}
