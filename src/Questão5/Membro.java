package Questão5;

import java.util.ArrayList;
import java.util.List;

public class Membro {
    private static int totalMembros = 0;

    private final int id;
    private String nome;
    private List<Livro> livrosEmprestados = new ArrayList<>();

    public Membro(String nome) {
        this.id = ++totalMembros;
        this.nome = nome;
    }

    public static int getTotalMembros() {
        return totalMembros;
    }

    public void emprestarLivro(Livro livro) {
        if (livrosEmprestados.size() >= BibliotecaUtil.LimiteEmprestimos) {
            System.out.println(nome + " atingiu o limite de empréstimos!");
            return;
        }

        if (livro.isEmprestado()) {
            System.out.println("Livro \"" + livro.getTitulo() + "\" já está emprestado!");
            return;
        }

        livro.setEmprestado(true);
        livrosEmprestados.add(livro);
        System.out.println(nome + " emprestou \"" + livro.getTitulo() + "\"");
    }

    public void devolverLivro(Livro livro) {
        if (livrosEmprestados.remove(livro)) {
            livro.setEmprestado(false);
            System.out.println(nome + " devolveu \"" + livro.getTitulo() + "\"");
        } else {
            System.out.println(nome + " não possui este livro!");
        }
    }
}
