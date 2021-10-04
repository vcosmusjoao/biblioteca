package br.com.letscode.java.biblioteca.usuario;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class Usuario {
    private String nome;
    private String matricula;
    private String email;
    private int diasUteis;
    private LocalDate dataPunicao;
    private int qtdLivrosEmprestimo;
}
