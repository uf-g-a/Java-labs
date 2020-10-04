package laba7;

public class Country {
    private String name;
    private double area;

    public Country(String name, double area){
        this.name = name;
        this.area = area;
    }
    public String getName(){
        return name;
    }
    public void getInfo(){
        System.out.println("Country's name " + name);
        System.out.println("Country's area "+ area);
    }
}
