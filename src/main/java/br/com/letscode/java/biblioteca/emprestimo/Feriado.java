package br.com.letscode.java.biblioteca.emprestimo;

import lombok.Value;

import java.time.LocalDate;

@Value
public class Feriado {
<<<<<<< HEAD
    LocalDate feriado;
    String descricao;
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

>>>>>>> 61438697b883a045a099041a5c5212ec5af6892a
}
