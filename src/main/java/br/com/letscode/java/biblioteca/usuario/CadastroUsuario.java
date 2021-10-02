package br.com.letscode.java.biblioteca.usuario;

import java.util.ArrayList;
import java.util.List;

public class CadastroUsuario {
    private List<Usuario> usuarios = new ArrayList<>();

    public void adicionarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public List<Usuario> listarUsuario(){
        return usuarios;
    }
}
