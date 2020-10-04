package laba3;
import java.util.Scanner;

public class Plate extends Dish {
    private String type;

    public Plate()
    {
        name = "Тарелка";
    }

    public void setType()
    {
        System.out.println("Введите тип тарелки:");
        Scanner in = new Scanner(System.in);
        type = in.nextLine();
    }
    public void getType()
    {
        System.out.println("Тип тарелки: " + type);
    }
}
