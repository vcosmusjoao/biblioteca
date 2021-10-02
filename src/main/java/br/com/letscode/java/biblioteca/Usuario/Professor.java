package br.com.letscode.java.biblioteca.Usuario;

public class Professor extends Usuario{
    public static final int QTD_LIVRO = 5;
    public static final int DIAS_UTEIS = 20;

    public Professor(String nome, String prontuario, String email) {
        super(nome, prontuario, email);
    }
}
