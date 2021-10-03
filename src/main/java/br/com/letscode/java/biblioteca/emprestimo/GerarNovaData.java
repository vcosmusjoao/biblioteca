package br.com.letscode.java.biblioteca.emprestimo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.time.DayOfWeek.*;

public class GerarNovaData {
    public static boolean isDiaUtil(LocalDate data) {
        DayOfWeek dayOfWeek = data.getDayOfWeek();

        return !(SATURDAY.equals(dayOfWeek) || SUNDAY.equals(dayOfWeek) || isFeriado(data));
    }

    private static boolean isFeriado(LocalDate data) {
        List<Feriado> feriados = getFeriado();
        for (Feriado f : feriados) {
            if (f.getData().isEqual(data)) {
                return true;
            }
        }

        return false;
    }

    private static List<Feriado> getFeriado(){
        List<Feriado> feriadosList = new ArrayList<>();

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
}
