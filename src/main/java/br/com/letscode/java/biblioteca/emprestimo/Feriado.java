package br.com.letscode.java.biblioteca.emprestimo;

import lombok.Value;

import java.time.LocalDate;

@Value
public class Feriado {
    LocalDate feriado;
    String descricao;
}
