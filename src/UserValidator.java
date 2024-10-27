public class UserValidator {

    public static void validateCredentials(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        // Проверка логина
        if (login.length() > 20 || !login.matches("[a-zA-Z0-9_]+")) {
            throw new WrongLoginException("Логин должен содержать только латинские буквы, цифры и знак подчеркивания, " +
                    "и быть не длиннее 20 символов.");
        }

        // Проверка пароля
        if (password.length() > 20 || !password.matches("[a-zA-Z0-9_]+")) {
            throw new WrongPasswordException("Пароль должен содержать только латинские буквы, цифры и знак подчеркивания, " +
                    "и быть не длиннее 20 символов.");
        }

        // Проверка на совпадение паролей
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароль и подтверждение пароля должны совпадать.");
        }
    }
}
