package laba2;

import java.util.Scanner;

public class Head {
    private String eyeColor;
    private String hairColor;
    public void setEyeColor(){
        System.out.print("eye color: ");
        Scanner in = new Scanner(System.in);
        eyeColor = in.nextLine();
    }

    public void setHairColor() {
        System.out.print("hair color: ");
        Scanner in = new Scanner(System.in);
        hairColor = in.nextLine();
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }
}
