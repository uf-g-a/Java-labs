package practika3;

import java.util.Scanner;

public abstract class Sharp{
    protected String color;
    protected boolean filled;
    public Sharp(){};

    public Sharp(String color_, boolean filled_)
    {
        this.color = color_;
        this.filled = filled_;
    }

    String getColor(){
        return color;
    }

    void setColor(){
        Scanner in = new Scanner(System.in);
        color = in.nextLine();
    }

    boolean isFilled(){
        return filled;
    }

    void setFilled(){
        if(color != "")
            filled = true;
        else
            filled = false;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}
