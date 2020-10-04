package laba4;

public class Planet implements getName{
    private String name;
    private int radius;

    public Planet(String name, int radius){
        this.name = name;
        this.radius = radius;
    }

    public String getName(){
        return name;
    }
}
