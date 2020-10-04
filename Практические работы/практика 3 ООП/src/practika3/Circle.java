package practika3;

public class Circle extends Sharp{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public  double getArea(){
        return (3.14 * radius * radius);
    };
    public  double getPerimeter(){
        return (3.14 * 2 * radius);
    };
    public  String toString(){
        return  " Радиус: " + radius + " Площадь: " + getArea() + " Периметр: " + getPerimeter() + " Заполнен цвет: " + filled + " Цвет: " + color ;
    };
}
