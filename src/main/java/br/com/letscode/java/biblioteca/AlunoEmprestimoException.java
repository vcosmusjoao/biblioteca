package br.com.letscode.java.biblioteca;

public class AlunoEmprestimoException extends Exception {

    private static final String messageDefault=" Você não pode fazer mais emprestimo";

    public AlunoEmprestimoException(Exception cause){
        super(messageDefault,cause);
    }
    public AlunoEmprestimoException(String message){
        super(message);
    }

}
