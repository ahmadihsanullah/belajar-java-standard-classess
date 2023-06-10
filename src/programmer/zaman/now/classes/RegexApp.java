package programmer.zaman.now.classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp {
    public static void main(String[] args) {
        String name = "Programmer Zaman Now Ahmad Ihsanullah Rabbani";

        Pattern pattern = Pattern.compile("[a-zA-Z]*[a][m][a-zA-z]*");

        Matcher matcher = pattern.matcher(name);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
