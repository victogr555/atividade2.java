package Questão5;

public class TesteBiblioteca {
    public static void main(String[] args) {

        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis");
        Livro livro2 = new Livro("O Cortiço", "Aluísio Azevedo");
        Livro livro3 = new Livro("Memórias Póstumas", "Machado de Assis");

        Membro membro1 = new Membro("João Silva");
        Membro membro2 = new Membro("Maria Santos");

        System.out.println("    Testando Emprestimo   ");
        membro1.emprestarLivro(livro1);
        membro1.emprestarLivro(livro2);
        membro1.emprestarLivro(livro3);

        membro2.emprestarLivro(livro2);

        System.out.println("\n Testando Devoluções");
        membro1.devolverLivro(livro1);
        membro2.emprestarLivro(livro1);

        System.out.println("\n Estatisticas");
        System.out.println("Total de livros: " + Livro.getTotalLivros());
        System.out.println("Total de membros: " + Membro.getTotalMembros());
        System.out.println("Limite empréstimos: " + BibliotecaUtil.LimiteEmprestimos);
    }
}

