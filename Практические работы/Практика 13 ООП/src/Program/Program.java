package Program;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program {
    public static void main(String[] args){
        Pattern pattern = Pattern.compile("abcdefghijklmnopqrstuv18340");
        String first = "abcdefghijklmnopqrstuv18340";
        String second = "abcdefghijklmnoasdfasdpqrstuv18340.";
        Matcher matcher = pattern.matcher(first);
        System.out.println("Совпадают с заданной строкой (abcdefghijklmnopqrstuv18340)");
        System.out.println("Первая строка: " + matcher.find());
        Matcher matcher1 = pattern.matcher(second);
        System.out.println("Вторая строка: " + matcher1.find());
    }
}
