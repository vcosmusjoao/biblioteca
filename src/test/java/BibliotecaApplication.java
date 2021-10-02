import br.com.letscode.java.biblioteca.emprestimo.Feriado;
import br.com.letscode.java.biblioteca.livro.CadastrarLivro;
import br.com.letscode.java.biblioteca.livro.Livro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaApplication {

    private CadastrarLivro cadastrarLivro = new CadastrarLivro();
    List<Livro> livros;

    public static void main(String[] args) {
        BibliotecaApplication teste = new BibliotecaApplication();
        teste.iniciar();
        teste.listarLivros();

    }


    private void iniciar() {
        cadastrarLivros();
        this.livros = this.cadastrarLivro.listarLivros();

    }

    private void cadastrarLivros() {
        cadastrarLivro.adcionarLivro(new Livro("001", "A culpa é dasEstrelas", "John Green", "Intrinseca"));
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





}
