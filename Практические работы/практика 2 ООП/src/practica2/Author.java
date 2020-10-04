package practica2;

import java.util.Scanner;

public class Author {
    private String name;
    private String email;
    private char gender;
    public Author(String name_,char gender_) {
        this.name = name_;
        this.gender = gender_;
    }
    public void setEmail(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите email писателя.");
        email = in.nextLine();
    };
    public String getName(){
        return name;
    };
    public String getEmail(){
        return email;
    };
    public char getGender(){
        return gender;
    };
    public void ToString(){
        System.out.println("Имя автора: " + name + " (" + gender + ") Его email: " + email);
    };
}
