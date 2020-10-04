package praktika9;

import java.util.Scanner;

public class TrowsDemo2 {

    private static void getKey() {
        Scanner myScanner = new Scanner( System.in );
        String key = myScanner.next();
        printDetails( key );
    }
    private static void printDetails(String key) {

            String message = getDetails(key);
            System.out.println( message );


    }
    private static String getDetails(String key) {
        if((key == null) || (key.equals("f"))) {
            try {
                throw new Exception("Key set to empty string");
            } catch (Exception e) {
                System.out.println("error");
            }
        }
        return "data for " + key; }

    public static void main(String[] args){
        printDetails(null);
        getKey();
    }
}
