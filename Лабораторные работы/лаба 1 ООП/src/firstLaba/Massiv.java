package firstLaba;

import java.util.Scanner;

public class Massiv {
    private int[] mas = new int[10];

    public void setMas() {
        System.out.println("Введите элементы массива:");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++)
            mas[i] = in.nextInt();
        in.close();
    }

    public void getMasFor() {
        System.out.println("Вывод массива с помощью цикла for:");
        for (int i = 0; i < 10; i++)
            System.out.print(mas[i] + " ");
        System.out.println();
    }

    public void getMasWhile() {
        System.out.println("Вывод массива с помощью цикла while:");
        int number = 0;
        while (number < 10) {
            System.out.print(mas[number] + " ");
            number++;
        }
        System.out.println();
    }

    public void getMasDoWhile() {
        System.out.println("Вывод массива с помощью цикла do while:");
        int number = 0;
        do{
            System.out.print(mas[number] + " ");
            number++;
        } while (number < 10);
        System.out.println();
    }
}
