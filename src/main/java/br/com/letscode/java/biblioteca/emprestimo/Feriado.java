package br.com.letscode.java.biblioteca.emprestimo;

import lombok.Value;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Value
public class Feriado {
    LocalDate data;
    String descricao;

}
