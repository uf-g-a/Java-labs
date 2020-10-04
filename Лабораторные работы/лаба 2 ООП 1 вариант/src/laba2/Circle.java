package laba2;

import java.util.Scanner;

public class Circle {
    private int radius;
    private double perimeter;
    private double square;

    public void setinfo() {
        System.out.println("Введите радиус");
        Scanner in = new Scanner(System.in);
        radius = in.nextInt();
    }

    public void getinfo(){
        System.out.println("радиус: " + radius);
        perimeter = (2 * 3.14 * radius);
        square = (3.14 * radius * radius);
        System.out.println("Периметр: " + perimeter);
        System.out.println("Площадь: " + square);
    }
}
