package program1;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        GregorianCalendar First = new GregorianCalendar();
        GregorianCalendar second = new GregorianCalendar();
        Scanner in = new Scanner(System.in);
        second.set(Calendar.YEAR, in.nextInt());
        second.set(Calendar.MONTH, in.nextInt() - 1);
        second.set(Calendar.DAY_OF_MONTH, in.nextInt());

        Date firstDate = First.getTime();
        System.out.println(firstDate);
        Date secondDate = second.getTime();
        System.out.println(secondDate);
        if(firstDate.equals(secondDate)){
            System.out.println("Даты равны");
        }
        if(firstDate.after(secondDate)){
            System.out.println("Дата пользователя раньше");
        }
        if(firstDate.before(secondDate)){
            System.out.println("Дата пользователя позже");
        }
    }
}
