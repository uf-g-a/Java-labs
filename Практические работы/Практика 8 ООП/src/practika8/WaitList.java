package practika8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList{
    protected ConcurrentLinkedQueue<E> clq = new ConcurrentLinkedQueue<>();
    public WaitList(){};
    public WaitList(Collection<E> collection){
        clq.addAll(collection);
    }
    public String toString(){
        return clq.toString();
    }

    @Override
    public void add(Object element) {
        clq.add((E)element);
    }

    @Override
    public Object remove() {
        return clq.remove();
    }

    @Override
    public boolean contains(Object element) {
        return clq.contains(element);
    }

    @Override
    public boolean containsAll(Collection c) {
        return clq.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return clq.isEmpty();
    }
}
