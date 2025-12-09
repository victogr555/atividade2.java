package Questão5;

public class Livro {
    private static int totalLivros = 0;
    private final int codigo;
    private final String titulo;
    private final String autor;
    private boolean emprestado = false;

    public Livro(String titulo, String autor) {
        this.codigo = ++totalLivros;
        this.titulo = titulo;
        this.autor = autor;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean status) {
        this.emprestado = status;
    }

    public static int getTotalLivros() {
        return totalLivros;
    }
}
