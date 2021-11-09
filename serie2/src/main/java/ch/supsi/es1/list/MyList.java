package ch.supsi.es1.list;

import ch.supsi.es1.iterator.BackwardIterator;
import ch.supsi.es1.iterator.ForwardIterator;
import ch.supsi.es1.iterator.IMyIterator;

import java.util.ArrayList;
import java.util.List;

public class MyList<T> implements IMyList<T> {

    private List<T> list = null;

    public MyList(){
        list = new ArrayList<>();
    }

    @Override
    public void addElement(T obj){
        list.add(obj);
    }

    public int length(){
        int length = list.size();
        return length;
    }

    public T getElement(int pos){
        T elem = list.get(pos);
        return elem;
    }

    @Override
    public IMyIterator<T> getForwardIterator(){
        return new ForwardIterator<>(this);
    }

    @Override
    public IMyIterator<T> getBackwardIterator(){
        return new BackwardIterator<>(this);
    }

}
