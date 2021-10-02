package br.com.letscode.java.biblioteca.usuario;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Aluno extends Usuario {
    public static final int QTD_LIVRO = 3;
    public static final int DIAS_UTEIS = 10;
    private boolean temEmprestimo;

    public Aluno(String nome, String matricula, String email) {
        super(nome, matricula, email, DIAS_UTEIS, 0);
        this.temEmprestimo = false;
    }
}

