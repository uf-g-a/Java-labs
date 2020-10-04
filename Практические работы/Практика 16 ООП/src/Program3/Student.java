package Program3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Student {
    private GregorianCalendar date = new GregorianCalendar();
    public void setDate(){
        Scanner in = new Scanner(System.in);
        date.set(Calendar.YEAR, in.nextInt());
        date.set(Calendar.MONTH, in.nextInt() - 1);
        date.set(Calendar.DAY_OF_MONTH, in.nextInt());
    }

    @Override
    public String toString() {
        int format;
        Scanner in = new Scanner(System.in);
        format = in.nextInt();
        switch (format){
            case 1: {
                SimpleDateFormat dateFormat = new SimpleDateFormat("d.MM.yy");
                return "short format: " + dateFormat.format(date.getTime());
            }
            case 2: {
                SimpleDateFormat dateFormat = new SimpleDateFormat("d MMMM yyyy");
                return  "medium format: " + dateFormat.format(date.getTime());
            }
            case 3: {
                SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, d MMMM yyyy GG");
                return "long format: " +dateFormat.format(date.getTime());
            }
            default:
            {
                break;
            }

        }
        return "wrong format";
    }

    public static void main(String[] args){
        Student student = new Student();
        student.setDate();
        System.out.println(student.toString());
    }
}
