package br.com.letscode.java.biblioteca.Usuario;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class Usuario {
    private String nome;
    private String prontuario;
    private String email;
}
