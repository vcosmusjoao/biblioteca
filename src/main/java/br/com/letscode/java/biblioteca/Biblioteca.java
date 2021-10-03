package br.com.letscode.java.biblioteca;

import br.com.letscode.java.biblioteca.usuario.Usuario;


import br.com.letscode.java.biblioteca.emprestimo.Emprestimo;
import br.com.letscode.java.biblioteca.emprestimo.EmprestimoException;
import br.com.letscode.java.biblioteca.livro.Livro;
import br.com.letscode.java.biblioteca.usuario.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private final List<Usuario> usuarios;
    private final List<Livro> livros;
    private final List<Emprestimo> emprestimos;

    public Biblioteca() {
        this.usuarios = new ArrayList<>();
        this.livros = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    public void adicionarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public List<Usuario> listarUsuarios(){
        return this.usuarios;
    }

    public void adicionarLivro(Livro livro){
        this.livros.add(livro);
    }

    public List<Livro> listarLivros(){
        return this.livros;
    }

    public void adicionarEmprestimo(Usuario usuario, List<Livro> livros) throws EmprestimoException {
        this.emprestimos.add(new Emprestimo(usuario, livros));
    }

    public List<Emprestimo> listarEmprestimos() {
        return this.emprestimos;

    }

    public void devolverLivro(Usuario usuario, List<Livro> livros) {
        for (Emprestimo e : this.emprestimos) {
            if (e.getUsuario().hashCode() == usuario.hashCode() && e.getLivros().hashCode() == livros.hashCode()) {
                this.emprestimos.remove(e);
                break;
            }
        }
    }
}
