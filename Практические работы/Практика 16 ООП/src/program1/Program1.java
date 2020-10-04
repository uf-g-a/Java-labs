package program1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program1 {
    public static void main(String[] args){
        Date dateNow = new Date();
        SimpleDateFormat formatDateNow = new SimpleDateFormat("E yyyy.MM.dd 'В' hh:mm:ss a zzz");
        System.out.println("Дата и время сдачи: " + formatDateNow.format(dateNow));
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
        String str = "2011-11-11";
        Date date;
        try {
            date = ft.parse(str);
            System.out.println("Дата получения задания: " + date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
