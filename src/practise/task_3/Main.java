package practise.task_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String str = "Versions: Java  5, Java 6, Java   7, Java 8.";
        Pattern p = Pattern.compile("Java\\s+[0-9]");
        Matcher m = p.matcher(str);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
