package Questão5;

public class BibliotecaUtil {
    public static final int LimiteEmprestimos = 2;

    private BibliotecaUtil() {}

    public static boolean validarNome(String nome) {
        return nome != null && !nome.isEmpty();
    }
}
