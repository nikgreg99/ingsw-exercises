package ch.supsi.es1.list;

import ch.supsi.es1.iterator.IMyIterator;

public interface IMyList<T> {

    public void addElement(T obj);
    public int length();
    public T getElement(int index);
    public IMyIterator<T> getForwardIterator();
    public IMyIterator<T> getBackwardIterator();
}
