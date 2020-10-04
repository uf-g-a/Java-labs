package laba8;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String text;
        try(FileWriter fw = new FileWriter("text.txt")) {
            text = "Text";
            fw.write(text);
        }
        try(FileReader fr = new FileReader("text.txt")) {
            int c;
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }
        }
        System.out.println();
        try(FileWriter fw = new FileWriter("text.txt")) {
            Scanner in = new Scanner(System.in);
            text = in.nextLine();
            fw.write(text);
        }
        try(FileReader fr = new FileReader("text.txt")) {
            int c;
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }
        }

    }
}
