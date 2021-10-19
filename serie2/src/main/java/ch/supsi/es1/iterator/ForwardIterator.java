package ch.supsi.es1.iterator;

import java.util.List;

public class ForwardIterator<T> implements MyIterator<T>{

    private final List<T> list;
    private int index;

    public ForwardIterator(List<T> list) {
        this.list = list;
        index = 0;
    }

    @Override
    public void rewind() {
        index = 0;
    }

    @Override
    public T nextElement() {
        final T obj =  list.get(index);
        index++;
        return obj;
    }

    @Override
    public boolean hasMoreElements() {
        return (index  <= (list.size() - 1));
    }
}
