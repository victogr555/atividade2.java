package Questão3;

public class User {
    private static int totalUsers = 0;

    private final int id;
    private String name;
    private String email;

    public User(String name, String email) {
        this.id = ++totalUsers;
        this.name = name;

        if (isValidEmail(email)) {
            this.email = email;
        } else {
            this.email = "Email inválido";
            System.out.println("Erro: Email inválido: " + email);
        }
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public static int getTotalUsers() {
        return totalUsers;
    }
    public static boolean isValidEmail(String email) {
        return email.contains("@") && email.contains(".");
    }
}
