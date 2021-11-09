package ch.supsi.es1.iterator;

import ch.supsi.es1.list.IMyList;

public class BackwardIterator<T> implements IMyIterator<T> {

    private final IMyList<T> list;
    private int index;

    public BackwardIterator(IMyList<T> list) {
        this.list = list;
        index = list.length() - 1;
    }

    @Override
    public void rewind() {
        index = list.length()- 1;
    }

    @Override
    public T nextElement() {
        final T obj = list.getElement(index);
        index--;
        return obj;
    }

    @Override
    public boolean hasMoreElements() {
        return index >= 0;
    }
}
