package br.com.letscode.java.biblioteca.emprestimo;

import br.com.letscode.java.biblioteca.livro.Livro;
import br.com.letscode.java.biblioteca.usuario.Usuario;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Setter
@Getter
@ToString
public class Emprestimo {
    private Usuario usuario;
    private Livro livro;
    private LocalDate dataInicio;
    private LocalDate dataFim;


    public Emprestimo(Usuario usuario, Livro livro) {
        this.usuario = usuario;
        this.livro = livro;
        this.dataInicio = LocalDate.now();
        this.dataFim = null;
    }
}
