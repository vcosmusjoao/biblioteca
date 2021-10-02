package br.com.letscode.java.biblioteca.Usuario;

public class Aluno extends Usuario {
    public static final int QTD_LIVRO = 3;
    public static final int DIAS_UTEIS = 10;

    public Aluno(String nome, String prontuario, String email) {
        super(nome, prontuario, email);
    }
}
