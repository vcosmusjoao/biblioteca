import br.com.letscode.java.biblioteca.Biblioteca;
import br.com.letscode.java.biblioteca.emprestimo.Emprestimo;
import br.com.letscode.java.biblioteca.emprestimo.EmprestimoException;
import br.com.letscode.java.biblioteca.livro.CadastrarLivro;
import br.com.letscode.java.biblioteca.livro.Livro;
import br.com.letscode.java.biblioteca.usuario.Aluno;
import br.com.letscode.java.biblioteca.usuario.CadastroUsuario;
import br.com.letscode.java.biblioteca.usuario.Professor;
import br.com.letscode.java.biblioteca.usuario.Usuario;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApplication {
    private CadastrarLivro cadastrarLivro = new CadastrarLivro();
    private CadastroUsuario cadastrarUsuario = new CadastroUsuario();
    Biblioteca biblioteca = new Biblioteca();

    List<Livro> livros = new ArrayList<>();
    List<Usuario> usuarios = new ArrayList<>();

    public static void main(String[] args) {
        BibliotecaApplication teste = new BibliotecaApplication();
        teste.iniciar();
    }

    private void iniciar() {
        cadastrarLivros();
        this.livros = this.cadastrarLivro.listarLivros();

        cadastrarUsuarios();
        this.usuarios=this.cadastrarUsuario.listarUsuario();

        listarLivros();
        System.out.println();
        emprestimo();
    }

    private void cadastrarLivros() {
        cadastrarLivro.adcionarLivro(new Livro("001", "A culpa é das Estrelas", "John Green", "Intrinseca"));
        cadastrarLivro.adcionarLivro(new Livro("002", "Orgulho e Preconceito", "Jane Austen", "Martin Claret"));
        cadastrarLivro.adcionarLivro(new Livro("003", "1984", "George Orwell", "Companhia das Letras"));
        cadastrarLivro.adcionarLivro(new Livro("004", "Dom Quixote de la Mancha", "Miguel de Cervantes", "Montecristo"));
        cadastrarLivro.adcionarLivro(new Livro("005", "O Pequeno Príncipe", "Antoine de Saint-Exupéry", "autentica"));
    }

    private void cadastrarUsuarios(){
        cadastrarUsuario.adicionarUsuario(new Professor("Jessé","001","jesse@gmail.com"));
        cadastrarUsuario.adicionarUsuario((new Aluno("João Victor","002","joao@gmail.com")));
        cadastrarUsuario.adicionarUsuario((new Aluno("Lauredi","003","lauredi@gmail.com")));
        cadastrarUsuario.adicionarUsuario((new Aluno("Lidia Lima","004","lidia@gmail.com")));
        cadastrarUsuario.adicionarUsuario((new Aluno("Leonardo","005","leonardo@gmail.com")));
        cadastrarUsuario.adicionarUsuario((new Aluno("Kauan","006","kauan@gmail.com")));
    }

    public void listarLivros() {
        System.out.println("Livros Disponiveis");
        int i=1;
        for (Livro livro : livros) {
            System.out.println("======LIVRO "+(i++)+" "+livro);
        }
    }

    private void emprestimo() {
        List<Livro> t = new ArrayList<>();
        t.add(this.livros.get(0));
        t.add(this.livros.get(1));

        try {
            biblioteca.adicionarEmprestimo(usuarios.get(0), t);
            biblioteca.adicionarEmprestimo(usuarios.get(0), t);
            biblioteca.adicionarEmprestimo(usuarios.get(1), t);
        }
        catch (EmprestimoException e) {
            e.printStackTrace();
        }

        for(Emprestimo emprestimo : biblioteca.listarEmprestimos()){
            System.out.println(emprestimo);
        }

        System.out.println();

        biblioteca.devolverLivro(usuarios.get(0), t);

        for(Emprestimo emprestimo : biblioteca.listarEmprestimos()){
            System.out.println(emprestimo);
        }
    }
}
