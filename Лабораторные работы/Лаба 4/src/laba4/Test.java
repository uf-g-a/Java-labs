package laba4;

public class Test {
    public static void main(String[] arg){
        Animal animal = new Animal("Зебра", 100);
        Planet planet = new Planet("Плутон", 5000);
        Car car = new Car("Хонда", "Седан");
        System.out.println(animal.getName() + " " + planet.getName() + " " + car.getName());
    }
}
