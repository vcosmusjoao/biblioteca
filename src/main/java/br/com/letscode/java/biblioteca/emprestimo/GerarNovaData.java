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

    private static List<Feriado> getFeriado() {
        List<Feriado> feriados = new ArrayList<>();

        feriados.add(new Feriado(LocalDate.of(2021, 1,1), ""));
        feriados.add(new Feriado(LocalDate.of(2021, 4,2), ""));
        feriados.add(new Feriado(LocalDate.of(2021, 4,21), ""));
        feriados.add(new Feriado(LocalDate.of(2021, 5,1), ""));
        feriados.add(new Feriado(LocalDate.of(2021, 9,7), ""));
        feriados.add(new Feriado(LocalDate.of(2021, 10,12), ""));
        feriados.add(new Feriado(LocalDate.of(2021, 11,2), ""));
        feriados.add(new Feriado(LocalDate.of(2021, 11,15), ""));
        feriados.add(new Feriado(LocalDate.of(2021, 12,25), ""));

        return feriados;
    }
}
