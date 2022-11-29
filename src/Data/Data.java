package Data;


import java.util.Objects;

public class Data {

    private String login;
    private String password;
    private String confirmPassword;

    public Data(String login, String password, String confirmPassword) {
        setLogin(login);
        setPassword(password);
        setConfirmPassword(confirmPassword);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {

        this.login = checkCharacters(login);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = checkCharacters(password);
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = checkCharacters(confirmPassword);
    }

    public static String checkCharacters(String symbols) {

        if (symbols.length() < 1 && symbols.length() > 20) {
            throw new WrongLoginException("Длина должна быть от 1 до 20");
        }
        if (symbols.matches("^[a-zA-Z0-9_]+${1,20}")) {
            return symbols;
        }
        throw new WrongLoginException("Строка должна содержать в себе только латинские буквы, цифры и знак подчеркивания.");
    }




    @Override
    public String toString() {
        return
                "login- " + login + ", password- " + password + ", confirmPassword- " + confirmPassword;
    }
}
