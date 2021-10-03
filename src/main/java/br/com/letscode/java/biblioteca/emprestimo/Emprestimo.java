package br.com.letscode.java.biblioteca.emprestimo;

import br.com.letscode.java.biblioteca.livro.Livro;
import br.com.letscode.java.biblioteca.usuario.Aluno;
import br.com.letscode.java.biblioteca.usuario.Professor;
import br.com.letscode.java.biblioteca.usuario.Usuario;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
@ToString
public class Emprestimo {
    private Usuario usuario;
    private List<Livro> livros;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public Emprestimo(Usuario usuario, List<Livro> livros) throws EmprestimoException {
        if (usuario instanceof Aluno) {
            validarAluno(usuario, livros.size());
        }
        else {
            validarProfessor(usuario, livros.size());
        }

        this.usuario = usuario;
        this.livros = livros;
        this.dataInicio = LocalDate.now();
        this.dataFim = gerarDataFim(usuario.getDiasUteis());
    }

    private void validarProfessor(Usuario usuario, int count) throws EmprestimoException {
        int livrosTotal = usuario.getQtdLivrosEmprestimo() + count;

        if (livrosTotal > Professor.QTD_LIVRO || verificarPunicao(usuario)) {
            throw new EmprestimoException("O professor não pode realizar o emprestimo");
        }
        else {
            usuario.setQtdLivrosEmprestimo(livrosTotal);
        }
    }

    private boolean verificarPunicao(Usuario usuario) {
        LocalDate dataPunicao = usuario.getDataPunicao();
        LocalDate hoje = LocalDate.now();

        if (usuario.getDataPunicao() == null) {
            return false;
        }

        return dataPunicao.isAfter(hoje) || dataPunicao.equals(hoje);
    }

    private void validarAluno(Usuario usuario, int count) throws EmprestimoException {
        if (usuario.getQtdLivrosEmprestimo() != 0 || count > Aluno.QTD_LIVRO || verificarPunicao(usuario)) {
            throw new EmprestimoException("O aluno não pode realizar o emprestimo");
        }
        else {
            usuario.setQtdLivrosEmprestimo(count);
        }
    }

    private LocalDate gerarDataFim(int qtdDias) {
        LocalDate data = LocalDate.now();
        int diasUteis = 0;

        while (diasUteis < qtdDias) {
            data = data.plusDays(1);

            if (GerarNovaData.isDiaUtil(data)) {
                diasUteis++;
            }
        }

        return data;
    }

    public void colocarPunicao() {
        LocalDate data = LocalDate.now();

        if (data.isAfter(this.dataFim)) {
            int diasUteis = 0;

            while (diasUteis < GerarNovaData.dataPunicao(this.dataFim)) {
                data = data.plusDays(1);

                if (GerarNovaData.isDiaUtil(data)) {
                    diasUteis++;
                }
            }

            this.usuario.setDataPunicao(data);
        }
    }
}
