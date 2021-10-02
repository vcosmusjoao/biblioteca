package br.com.letscode.java.biblioteca.livro;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor

public class Livro {
    private String isbn;
    private String titulo;
    private String autor;
    private String editora;

}
