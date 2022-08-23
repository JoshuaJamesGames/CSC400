package CSC400;

public interface Bag {

    abstract boolean add();
    abstract boolean remove();
    abstract boolean isFull();
    abstract <T> T[] toArray();

}
