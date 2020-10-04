package practika3;

import java.util.Scanner;

public class Square extends Rectangle{
    public Square(){};
    public Square(double side){
        this.weight = side;
        this.length = side;
    }
    public Square(double side, String color, boolean filled){
        this.length = side;
        this.weight = side;
        this.color = color;
        this.filled = filled;
    }

    public void setSide(){
        Scanner in = new Scanner(System.in);
        length = in.nextInt();
        weight = length;
    }
    public double getSide(){
        return length;
    }

    @Override
    public void setWeight() {
        Scanner in = new Scanner(System.in);
        weight = in.nextInt();
    }

    @Override
    public void setLength() {
        Scanner in = new Scanner(System.in);
        length = in.nextInt();
    }

    @Override
    public String toString() {
        return  "Длина: " + length + " Площадь: " + getArea() + " Периметр: " + getPerimeter() + " Заполнен цвет: " + filled + " Цвет: " + color ;
    }
}
