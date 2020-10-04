package practika3;

import java.util.Scanner;

public class Rectangle extends Sharp{
    protected double weight;
    protected double length;

    public Rectangle() {};
    public Rectangle(double weight, double length){
        this.weight = weight;
        this.length = length;
    }
    public Rectangle(double weight, double length, String color, boolean filled){
        this.weight = weight;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public void setWeight(){
        Scanner in = new Scanner(System.in);
        weight = in.nextInt();
    }
    public double getWeight(){
        return weight;
    }
    public void setLength(){
        Scanner in = new Scanner(System.in);
        length = in.nextInt();
    }
    public double getLength(){
        return length;
    }

    public  double getArea(){
        return weight * length;
    };
    public  double getPerimeter(){
        return 2* (weight + length);
    };
    public  String toString(){
        return  "Ширина: " + weight + " Длина: " + length + " Площадь: " + getArea() + " Периметр: " + getPerimeter() + " Заполнен цвет: " + filled + " Цвет: " + color ;
    };
}
