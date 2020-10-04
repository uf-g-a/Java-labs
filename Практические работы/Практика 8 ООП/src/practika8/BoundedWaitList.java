package practika8;

public class BoundedWaitList<E> extends WaitList{
    private int capacity;
    public BoundedWaitList(int capacity){
        this.capacity = capacity;
    }
    public int getCapacity(){
        return capacity;
    }
    public void add(Object element){
        if(clq.size() < capacity)
            clq.add(element);
        else
            throw new IndexOutOfBoundsException("Size > capacity");
    }
}
