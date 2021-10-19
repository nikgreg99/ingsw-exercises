package ch.supsi.es1.iterator;

public interface MyIterator<T> {
    void rewind();
    T nextElement();
    boolean hasMoreElements();
}
