package Program;

import java.util.Hashtable;
import java.util.Scanner;

public class hashtab {
    private Hashtable <Integer, String> vocabulary = new Hashtable<>();
    public void hashtabLookup(){
        System.out.println("vocabulary: " + vocabulary);
    }

    public void hashtabAdd(){
        System.out.println("Введите ключ и знаечение для того, чтоб давбвать в таблицу:");
        Scanner in = new Scanner(System.in);
        int key = in.nextInt();
        String word = in.nextLine();
        vocabulary.put(key, word);
    }

    public void hashtabInit(){
        System.out.println("Введите ключ, по которому вы хотите получить значение:");
        Scanner in = new Scanner(System.in);
        int key = in.nextInt();
        System.out.println(vocabulary.get(key));

    }
    public void hashtabHash(){
        System.out.println("Ключи: " + vocabulary.keySet());
    }
    public void hashtabDelete(){
        System.out.println("Введите ключ элемента, который хотите удалить");
        Scanner in = new Scanner(System.in);
        int key = in.nextInt();
        vocabulary.remove(key);
    }

    public static void main(String[] args){
        hashtab example = new hashtab();
        example.hashtabAdd();
        example.hashtabAdd();
        example.hashtabAdd();
        example.hashtabDelete();
        example.hashtabInit();
        example.hashtabHash();
        example.hashtabLookup();
    }
}
