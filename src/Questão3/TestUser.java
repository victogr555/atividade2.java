package Questão3;

public class TestUser {
    public static void main(String[] args) {

        User user1 = new User("João", "joao@email.com");
        User user2 = new User("Maria", "maria@email.com");
        User user3 = new User("Pedro", "pedro.email.com");
        System.out.println("Total de usuários: " + User.getTotalUsers());
        System.out.println("User1 ID: " + user1.getId());
        System.out.println("Email válido? " + User.isValidEmail("teste@email.com"));
    }
}



