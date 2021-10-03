import br.com.letscode.java.biblioteca.emprestimo.Emprestimo;
import br.com.letscode.java.biblioteca.emprestimo.Feriado;
import br.com.letscode.java.biblioteca.livro.CadastrarLivro;
import br.com.letscode.java.biblioteca.livro.Livro;
import br.com.letscode.java.biblioteca.usuario.Aluno;
import br.com.letscode.java.biblioteca.usuario.CadastroUsuario;
import br.com.letscode.java.biblioteca.usuario.Professor;
import br.com.letscode.java.biblioteca.usuario.Usuario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaApplication {

    private CadastrarLivro cadastrarLivro = new CadastrarLivro();
    List<Livro> livros;

    private CadastroUsuario cadastrarUsuario= new CadastroUsuario();
    List<Usuario> usuarios;

    List<Emprestimo> emprestimos= new ArrayList<>();



    public static void main(String[] args) {
        BibliotecaApplication teste = new BibliotecaApplication();
        teste.iniciar();
        teste.listarLivros();
    }

    private void iniciar() {
        cadastrarLivros();
        this.livros = this.cadastrarLivro.listarLivros();
        cadastrarUsuarios();
        this.usuarios=this.cadastrarUsuario.listarUsuario();
        emprestimo();


    }


    private void cadastrarLivros() {
        cadastrarLivro.adcionarLivro(new Livro("001", "A culpa é das Estrelas", "John Green", "Intrinseca"));
        cadastrarLivro.adcionarLivro(new Livro("002", "Orgulho e Preconceito", "Jane Austen", "Martin Claret"));
        cadastrarLivro.adcionarLivro(new Livro("003", "1984", "George Orwell", "Companhia das Letras"));
        cadastrarLivro.adcionarLivro(new Livro("004", "Dom Quixote de la Mancha", "Miguel de Cervantes", "Montecristo"));
        cadastrarLivro.adcionarLivro(new Livro("005", "O Pequeno Príncipe", "Antoine de Saint-Exupéry", "autentica"));
    }


    public void listarLivros() {
        System.out.println("Livros Disponiveis");
        int i=1;
        for (Livro livro : livros) {
            System.out.println("======LIVRO "+(i++)+" "+livro);
        }
    }

    private void cadastrarUsuarios(){
        cadastrarUsuario.adicionarUsuario(new Professor("Jessé","001","jesse@gmail.com"));
        cadastrarUsuario.adicionarUsuario((new Aluno("João Victor","002","joao@gmail.com")));
        cadastrarUsuario.adicionarUsuario((new Aluno("Lauredi","003","lauredi@gmail.com")));
        cadastrarUsuario.adicionarUsuario((new Aluno("Lidia Lima","004","lidia@gmail.com")));
        cadastrarUsuario.adicionarUsuario((new Aluno("Leonardo","005","leonardo@gmail.com")));
        cadastrarUsuario.adicionarUsuario((new Aluno("Kauan","006","kauan@gmail.com")));
    }

    private void emprestimo(){


            emprestimos.add(new Emprestimo(usuarios.get(0), livros.get(2)));
            emprestimos.add(new Emprestimo(usuarios.get(0), livros.get(1)));
            emprestimos.add(new Emprestimo(usuarios.get(0), livros.get(3)));
            emprestimos.add(new Emprestimo(usuarios.get(1), livros.get(0)));
            emprestimos.add(new Emprestimo(usuarios.get(2), livros.get(4)));


        for(Emprestimo emprestimo:emprestimos){
            System.out.println(emprestimo);
        }

        

    }







}
