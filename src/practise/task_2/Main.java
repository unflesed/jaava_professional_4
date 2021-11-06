package practise.task_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String str = "aa aba abba abbba abca abea";
        Pattern p = Pattern.compile("ab*a");
        Matcher m = p.matcher(str);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
