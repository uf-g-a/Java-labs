package laba2;

import java.util.Scanner;

public class Hand {
    private double armLength;
    private double palmLength;

    public void setArmLength() {
        System.out.print("arm length: ");
        Scanner in = new Scanner(System.in);
        armLength = in.nextDouble();
    }
    public void setPalmLength(){
        System.out.print("palm length: ");
        Scanner in = new Scanner(System.in);
        palmLength = in.nextDouble();
    }

    public double getArmLength() {
        return armLength;
    }

    public double getPalmLength() {
        return palmLength;
    }
}
