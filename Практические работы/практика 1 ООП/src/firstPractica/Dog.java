package firstPractica;

import java.awt.*;
import java.lang.*;
import java.util.Scanner;

public class Dog {
    private String name;
    private String breed;
    private int weight;

    public void setinfo() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter dog's info.");
        System.out.println("Name: ");
        name = in.nextLine();
        System.out.println("Breed: ");
        breed = in.nextLine();
        System.out.println("Weight: ");
        weight = in.nextInt();
        in.close();
    };

    public void getinfo() {
        System.out.printf("Name: %s\n" +
                "Bread: %s\n" +
                "Weight: %d\n", name, breed, weight);
    };
}

