package practise.task_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("qweRGwqdqw", "+38(098)77 88 999", "test@mail.com");
        User user2 = new User("qweRGwqdqwwqwq", "+38(098)77-88-999", "test213123@gmail.com");
        User user3 = new User("qweRGwqd", "+375(29)77 88 999", "test@yandex.ru");
        Pattern p1 = Pattern.compile("[a-zA-Z]{1,10}");
        Matcher m1 = p1.matcher(user1.getLogin());
        System.out.println("Логин первого юзера " + m1.matches());
        m1 = p1.matcher(user2.getLogin());
        System.out.println("Логин второго юзера " + m1.matches());
        m1 = p1.matcher(user3.getLogin());
        System.out.println("Логин третьего юзера " + m1.matches());
        Pattern p2 = Pattern.compile("\\+38\\(098\\)[0-9]+(\\s|-)[0-9]+(\\s|-)[0-9]+");
        m1 = p2.matcher(user1.getPhoneNumber());
        System.out.println("Телефон первого юзера " + m1.matches());
        m1 = p2.matcher(user2.getPhoneNumber());
        System.out.println("Телефон второго юзера " + m1.matches());
        m1 = p2.matcher(user3.getPhoneNumber());
        System.out.println("Телефон третьего юзера " + m1.matches());
        Pattern p3 = Pattern.compile("[a-zA-Z0-9]+@g*[^xyz]+");
        m1 = p3.matcher(user1.getEmail());
        System.out.println("Почта первого юзера " + m1.matches());
        m1 = p3.matcher(user2.getEmail());
        System.out.println("Почта второго юзера " + m1.matches());
        m1 = p3.matcher(user3.getEmail());
        System.out.println("Почта третьего юзера " + m1.matches());
    }
}
