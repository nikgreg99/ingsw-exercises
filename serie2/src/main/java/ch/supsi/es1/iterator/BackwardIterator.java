package ch.supsi.es1.iterator;

import java.util.List;

public class BackwardIterator<T> implements MyIterator<T>{

    private final List<T> list;
    private int index;

    public BackwardIterator(List<T> list) {
        this.list = list;
        index = list.size() - 1;
    }

    @Override
    public void rewind() {
        index = list.size() - 1;
    }

    @Override
    public T nextElement() {
        final T elem = list.get(index);
        index--;
        return elem;
    }

    @Override
    public boolean hasMoreElements() {
        return index >= 0;
    }
}