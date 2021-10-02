package br.com.letscode.java.biblioteca.emprestimo;

import lombok.Value;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Value
public class Feriado {

<<<<<<< HEAD
=======
    LocalDate data;
    String descricao;

    private static List<Feriado> getFeriados(){
        List<Feriado> feriadosList=new ArrayList<>();
        feriadosList.add(new Feriado(LocalDate.of(2021, 1, 1),"Confraternização Universal"));
        feriadosList.add(new Feriado(LocalDate.of(2021, 4, 2),"Páscoa"));
        feriadosList.add(new Feriado(LocalDate.of(2021, 4, 21),"Tiradentes"));
        feriadosList.add(new Feriado(LocalDate.of(2021, 5, 1),"Dia do Trabalho"));
        feriadosList.add(new Feriado(LocalDate.of(2021, 9, 7),"Independência"));
        feriadosList.add(new Feriado(LocalDate.of(2021, 10, 12),"Padroeira do Brasil"));
        feriadosList.add(new Feriado(LocalDate.of(2021, 11, 2),"Finados"));
        feriadosList.add(new Feriado(LocalDate.of(2021, 11, 15),"Proclamação da República"));
        feriadosList.add(new Feriado(LocalDate.of(2021, 12, 25),"Natal"));
        return feriadosList;
    }



>>>>>>> 05dce0da791eeec1b2bf8c6081c01f3efe8a0590
}
