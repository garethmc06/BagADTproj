public class ArrayBag<T> implements Bag<T>{
    private T[] bag;
    private int numberOfEntries;
    pravat static final int DEFAULT_CAPACITY = 25;
    

    public ArrayBag() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayBag(int capacity){
        T[] tempBag = (T[])new Object[capacity];
        bag = tempBag;
        numberOfEntries = 0;
    

    }

    public int getCurrentSize();


    boolean isEmpty();

    public boolean addNewEntry(T newEntry){
        if(isArrayFull()){
            return false;
        } else {
            bag[numberOfEntries] = newEntry;
            numberOfEntries++;
            return true;
        }
    }

    T remove();

    boolean remove(T anEntry);

    void clear();

    int getFrequencyOf(T anEntry);

    boolean contains(T anEntry);
    
    T[] toArray();

    public boolean isArrayFull(){
        if(numberOfEntries >= bag.length){
            return true;
        } else {
            return false;
        }
    }


}