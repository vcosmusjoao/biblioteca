package br.com.letscode.java.biblioteca;

import br.com.letscode.java.biblioteca.livro.Livro;
import br.com.letscode.java.biblioteca.usuario.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> livros= new ArrayList<>();

    public void adcionarLivro(Livro livro){
        this.livros.add(livro);
    }

    public List<Livro> listarLivros(){
        return livros;
    }
    
    private List<Usuario> usuario= new ArrayList<>();
    public void adcionarUsuario(Usuario usuario){
        this.usuario.add(usuario);
    }
    public List<Usuario> listarUsuario(){
        this.
    }

}
