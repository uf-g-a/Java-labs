package praktika7;


import java.util.ArrayDeque;

public class Program {
    public static void game(ArrayDeque<Integer> first, ArrayDeque<Integer> second, int tries){
        if (tries == 106) {
            System.out.println("botva");
            return;
        }
        if(first.peekFirst() == null) {
            System.out.println("second");
            return;
        }
        if(second.peekFirst() == null){
            System.out.println("first");
            return;
        }
        if(first.getFirst() == 0 && second.getFirst() == 9) {
            Integer t = second.pollFirst();
            first.addLast(t);
        }if(first.getFirst() == 9 && second.getFirst() == 0){

            Integer t = first.pollFirst();
            second.addLast(t);
        }
        else {
            if (first.peekFirst() > second.peekFirst()) {
                Integer t = second.pollFirst();
                first.addLast(t);
            }
            else {
                Integer t = first.pollFirst();
                second.addLast(t);
            }
        }
        tries++;
        game(first, second, tries);

    }
    public static void main(String[] args){
        ArrayDeque<Integer> first = new ArrayDeque<Integer>();
        ArrayDeque<Integer> second = new ArrayDeque<Integer>();
        second.addLast(1);
        second.addLast(0);
        second.addLast(8);
        second.addLast(9);
        second.addLast(5);
        first.addLast(4);
        first.addLast(3);
        first.addLast(2);
        first.addLast(6);
        first.addLast(7);
        game(first, second, 1);
    }
}
