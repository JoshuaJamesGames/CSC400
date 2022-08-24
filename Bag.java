

public interface Bag {

    abstract boolean add(Object anEntry);
    abstract boolean remove(Object anEntry);
    abstract boolean isFull();
    abstract <T> T[] toArray();

}
