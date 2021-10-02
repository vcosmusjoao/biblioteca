import br.com.letscode.java.biblioteca.livro.CadastrarLivro;
import br.com.letscode.java.biblioteca.livro.Livro;

import java.util.List;

public class BibliotecaApplication {

    private CadastrarLivro cadastrarLivro = new CadastrarLivro();
    List<Livro> livros;

    public static void main(String[] args) {
        BibliotecaApplication teste = new BibliotecaApplication();
        teste.iniciar();
        teste.listarLivro();

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
    private void listarLivro() {
        System.out.println("Livros Disponiveis");
        for (Livro livro : livros) {
            System.out.println(livro);
        }

    }
}
