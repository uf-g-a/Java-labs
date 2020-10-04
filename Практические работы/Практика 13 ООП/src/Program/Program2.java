package Program;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program2 {
    public static void main(String[] args){
        Pattern pattern = Pattern.compile("(\\d\\s\\+)");
        String first = "(1 + 8) – 9 / 4.";
        String second = "6 / 5 – 2 * 9.";
        Matcher matcher = pattern.matcher(first);
        int number = 4;
        while (matcher.find()){
            number--;
        }
        System.out.println("Количесвто цифр без + после в первой строке: " + number);

        matcher = pattern.matcher(second);
        number = 4;
        while (matcher.find()){
            number--;
        }

        System.out.println("Количесвто цифр без + после во второй строке: " + number);
    }
}
