import br.com.letscode.java.biblioteca.Biblioteca;
import br.com.letscode.java.biblioteca.emprestimo.Emprestimo;
import br.com.letscode.java.biblioteca.emprestimo.EmprestimoException;
import br.com.letscode.java.biblioteca.livro.Livro;
import br.com.letscode.java.biblioteca.usuario.Aluno;
import br.com.letscode.java.biblioteca.usuario.Professor;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApplication {
    Biblioteca biblioteca = new Biblioteca();

    public static void main(String[] args) {
        BibliotecaApplication teste = new BibliotecaApplication();
        teste.biblioteca = new Biblioteca();
        teste.iniciar();
    }

    private void iniciar() {
        this.cadastrarUsuarios();
        this.cadastrarLivros();
        this.emprestimo();
    }

    private void cadastrarLivros() {
        biblioteca.adicionarLivro(new Livro("001", "A culpa é das Estrelas", "John Green", "Intrinseca"));
        biblioteca.adicionarLivro(new Livro("002", "Orgulho e Preconceito", "Jane Austen", "Martin Claret"));
        biblioteca.adicionarLivro(new Livro("003", "1984", "George Orwell", "Companhia das Letras"));
        biblioteca.adicionarLivro(new Livro("004", "Dom Quixote de la Mancha", "Miguel de Cervantes", "Montecristo"));
        biblioteca.adicionarLivro(new Livro("005", "O Pequeno Príncipe", "Antoine de Saint-Exupéry", "autentica"));
    }

    private void cadastrarUsuarios(){
        biblioteca.adicionarUsuario(new Professor("Jessé","001","jesse@gmail.com"));
        biblioteca.adicionarUsuario((new Aluno("João Victor","002","joao@gmail.com")));
        biblioteca.adicionarUsuario((new Aluno("Lauredi","003","lauredi@gmail.com")));
        biblioteca.adicionarUsuario((new Aluno("Lidia Lima","004","lidia@gmail.com")));
        biblioteca.adicionarUsuario((new Aluno("Leonardo","005","leonardo@gmail.com")));
        biblioteca.adicionarUsuario((new Aluno("Kauan","006","kauan@gmail.com")));
    }

    private void emprestimo() {
        List<Livro> livrosEmprestimo = new ArrayList<>();
        livrosEmprestimo.add(biblioteca.listarLivros().get(0));
        livrosEmprestimo.add(biblioteca.listarLivros().get(1));

        try {
            biblioteca.adicionarEmprestimo(biblioteca.listarUsuarios().get(0), livrosEmprestimo);
            biblioteca.adicionarEmprestimo(biblioteca.listarUsuarios().get(0), livrosEmprestimo);
            biblioteca.adicionarEmprestimo(biblioteca.listarUsuarios().get(1), livrosEmprestimo);
            biblioteca.adicionarEmprestimo(biblioteca.listarUsuarios().get(2), livrosEmprestimo);
            biblioteca.adicionarEmprestimo(biblioteca.listarUsuarios().get(3), livrosEmprestimo);
            biblioteca.adicionarEmprestimo(biblioteca.listarUsuarios().get(4), livrosEmprestimo);
            biblioteca.adicionarEmprestimo(biblioteca.listarUsuarios().get(5), livrosEmprestimo);
        }
        catch (EmprestimoException e) {
            e.printStackTrace();
        }

        System.out.println("========EMPRESTIMOS REALIZADOS");
        for(Emprestimo emprestimo : biblioteca.listarEmprestimos()){
            System.out.println(emprestimo);
        }

        System.out.println();

        biblioteca.devolverLivro(biblioteca.listarUsuarios().get(0), livrosEmprestimo);
        biblioteca.devolverLivro(biblioteca.listarUsuarios().get(1), livrosEmprestimo);
        biblioteca.devolverLivro(biblioteca.listarUsuarios().get(4), livrosEmprestimo);

        System.out.println("========LIVROS QUE AINDA NÃO FORAM DEVOLVIDOS");
        for(Emprestimo emprestimo : biblioteca.listarEmprestimos()){
            System.out.println(emprestimo);
        }

        try {
            biblioteca.adicionarEmprestimo(biblioteca.listarUsuarios().get(2), livrosEmprestimo);
        }
        catch (EmprestimoException e) {
            e.printStackTrace();
        }

        System.out.println();
    }
}
