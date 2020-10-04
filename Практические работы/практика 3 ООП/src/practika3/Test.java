package practika3;

public class Test {
    public static void main(String[] arg){
        Circle circle = new Circle(10);
        System.out.println(circle.toString());
        Circle circle1 = new Circle(5, "red", true);
        System.out.println(circle1.toString());
        Rectangle rectangle = new Rectangle(5, 3, "blue", true);
        System.out.println(rectangle.toString());
        Square square = new Square(5, "green", true);
        System.out.println(square.toString());
    }
}
