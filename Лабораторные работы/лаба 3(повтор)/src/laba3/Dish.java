package laba3;

import java.util.Scanner;

public class Dish {
    protected String name;
    private String colour;
    private int weight;

    public Dish(){};

    public void setInfo()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название посуды:");
        colour = in.nextLine();
        System.out.println("Введите вес посуды:");
        weight = in.nextInt();
    }
    public void getInfo()
    {
        System.out.println("Название посуды: " + name + "\nЦвет посуды: " + colour + "\nВес посуды: " + weight);
    }
}
