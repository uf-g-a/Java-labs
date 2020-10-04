package laba2;

import java.util.Scanner;

public class Leg {
    private double footLength;

    public void setFootLength(){
        System.out.print("foot length: ");
        Scanner in = new Scanner(System.in);
        footLength = in.nextDouble();
    }

    public double getFootLength() {
        return footLength;
    }
}
