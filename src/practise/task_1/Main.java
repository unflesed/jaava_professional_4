package practise.task_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("a.b");
        Matcher m = p.matcher("ahb acb aeb aeeb adcb axeb");
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
