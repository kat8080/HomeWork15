package Data;
public class Data {
    private static final String VALID_CHARACTERS = "qwertyuioplkjhgfdsazxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM0123456789_"; //строка разрешенных символов

    private Data() {
    }


    public static boolean validate(String login,
                                   String password,
                                   String confirmPassword) {
        try {
            check(login, password, confirmPassword);
        } catch (WrongLoginException |  WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public static void check(String login,
                             String password,
                             String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!validate(login)) {
            throw new WrongLoginException("Логин не верный!");
        }
        if (!validate(password)) {
            throw new WrongPasswordException("Пароль не верный!");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли должны совпадать!");


            private static boolean validate(String a) {
        if (a.length() > 20) {
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            if (!VALID_CHARACTERS.contains(String.valueOf(a.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}}}


