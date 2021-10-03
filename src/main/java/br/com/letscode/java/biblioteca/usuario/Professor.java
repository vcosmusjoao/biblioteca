package br.com.letscode.java.biblioteca.usuario;

public class Professor extends Usuario {
    public static final int QTD_LIVRO = 5;
    public static final int DIAS_UTEIS = 20;

    public Professor(String nome, String matricula, String email) {
        super(nome, matricula, email, DIAS_UTEIS, null, 0);
    }
}
