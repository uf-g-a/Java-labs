package practika8;

public class UnfairWaitList<E> extends WaitList{
    public UnfairWaitList(){};
    public void remove(E element){
        clq.remove(element);
    }
    public void moveToBack(E element){
        remove(element);
        clq.add(element);
    }
}
