package Data;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Data data = new Data("", "asd",   "asd");
        //System.out.println(data);
        //checkPasswords(data.getPassword(), data.getConfirmPassword());
        System.out.println("kldsfi");
    }
    public static boolean checkPasswords(String password, String confirmPassword) {
        if (!Objects.equals(password, confirmPassword)) {
            throw new WrongPasswordException("Пароль и подтверждение пароля не совпадает");
        }
        return true;
       }
}
