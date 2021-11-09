package ch.supsi.es1.iterator;

public interface IMyIterator<T> {
    void rewind();
    T nextElement();
    boolean hasMoreElements();
}
