public class Main {
    public static void main(String[] args) {
        try {
            validateLogin("java_skypro_go");
            validatePassword("D_1hWiKjjP_9", "D_1hWiKjjP_9");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validateLogin(String login) throws WrongLoginException {
        if (login.length() > 20 || !login.matches("[a-zA-Z0-9_]+")) {
            throw new WrongLoginException("Invalid login");
        }
    }

    public static void validatePassword(String password, String confirmPassword) throws WrongPasswordException {
        if (password.length() > 20 || !password.matches("[a-zA-Z0-9_]+")) {
            throw new WrongPasswordException("Invalid password");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Passwords do not match");
        }
    }
}

class WrongLoginException extends Exception {
    public WrongLoginException(String message) {
        super(message);
    }
}

class WrongPasswordException extends Exception {
    public WrongPasswordException(String message) {
        super(message);
    }
}
