package ch.supsi.es1.iterator;

import ch.supsi.es1.list.IMyList;

public class ForwardIterator<T> implements IMyIterator<T> {

    private final IMyList<T> list;
    private int index;

    public ForwardIterator(IMyList<T> list) {
        this.list = list;
        index = 0;
    }

    @Override
    public void rewind() {
        index = 0;
    }

    @Override
    public T nextElement() {
        final T obj =  list.getElement(index);
        index++;
        return obj;
    }

    @Override
    public boolean hasMoreElements() {
        return (index  <= (list.length() - 1));
    }
}
