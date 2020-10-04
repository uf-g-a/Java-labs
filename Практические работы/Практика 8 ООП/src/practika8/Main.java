package practika8;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args){
        BoundedWaitList<Integer> bwl = new BoundedWaitList<>(3);
        bwl.add(4);
        bwl.add(6);
        bwl.add(10);
        //bwl.add(11);
        System.out.println(bwl.toString());

        UnfairWaitList<String> uwl = new UnfairWaitList<>();
        uwl.add("first");
        uwl.add("second");
        uwl.add("third");
        uwl.add("fourth");
        if(!uwl.isEmpty()) {
            System.out.println(uwl.toString());
            uwl.moveToBack("second");
            System.out.println(uwl.toString());
            uwl.remove("first");
            System.out.println(uwl.toString());
        }
        Collection<Integer> collection = new ArrayList<>();
        collection.add(5);
        collection.add(6);

        WaitList<Integer> waitList = new WaitList<>(collection);
        System.out.println(waitList.toString());
        System.out.println(waitList.contains(2));
        System.out.println(waitList.containsAll(collection));
    }
}
