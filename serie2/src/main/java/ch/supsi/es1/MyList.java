package ch.supsi.es1;

import ch.supsi.es1.iterator.BackwardIterator;
import ch.supsi.es1.iterator.ForwardIterator;
import ch.supsi.es1.iterator.MyIterator;

import java.util.ArrayList;
import java.util.List;

public class MyList<T> {

    private  List<T> list = null;

    public MyList(){
        list = new ArrayList<>();
    }

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

    public MyIterator<T> getForwardIterator(){
        return new ForwardIterator<>(list);
    }

    public MyIterator<T> getBackwardIterator(){
        return new BackwardIterator<>(list);
    }

}
