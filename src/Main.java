public class Main {

    public static void main(String[] args) {
        String login = "java_skypro_go";
        String password = "D_1hWiKjjP_9";
        String confirmPassword = "D_1hWiKjjP_9";

        try {
            UserValidator.validateCredentials(login, password, confirmPassword);
            System.out.println("Логин и пароль успешно проверены.");
        } catch (WrongLoginException e) {
            System.err.println("Ошибка: " + e.getMessage());
        } catch (WrongPasswordException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}