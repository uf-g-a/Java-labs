package praktika9;

import java.util.Scanner;

public class Exception1 {
    public static void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (Exception E){
            System.out.println("Error");
        }
        finally {
            System.out.print("Complete program");
        }
    }

    public static void main(String[] args)
    {
        exceptionDemo();
    }
}
