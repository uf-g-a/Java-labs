package laba3;

import java.util.Scanner;

public class Cup extends Dish{
    private String form_of_handle;
    public Cup()
    {
        name = "Чашка";
    }

    public void setForm_of_handle()
    {
        System.out.println("Введите форму ручки:");
        Scanner in = new Scanner(System.in);
        form_of_handle = in.nextLine();
    }

    public void getForm_of_handle()
    {
        System.out.println("Форма ручки: " + form_of_handle);
    }
}