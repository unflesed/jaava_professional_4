package java_professional_4.additional;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String login, password;
        Pattern pLogin = Pattern.compile("[a-zA-Z]+");
        Pattern pPassword = Pattern.compile("[a-zA-Z0-9]+");
        do {
            System.out.println("Введите логин для регистрации:");
            login = sc.nextLine();
            if (pLogin.matcher(login).matches()) {
                break;
            }else{
                System.out.println("Вы ввели неправильный логин. " +
                        "Логин должен состоять только из букв латинского алфавита.");
            }
        }while (true);
        do {
            System.out.println("Введите пароль для регистрации:");
            password = sc.nextLine();
            if (pPassword.matcher(password).matches()) {
                break;
            }else{
                System.out.println("Вы ввели неправильный пароль. " +
                        "Пароль должен состоять из букв латинского алфавита и цифр.");
            }
        }while (true);
        User user1 = new User(login, password);
        user1.created();
    }
}
