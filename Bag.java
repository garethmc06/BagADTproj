public interface Bag<T> {
    public int getCurrentSize();
    // Returns the current number of items in the bag.

    boolean isEmpty();
    // returns true if the bag is empty, false otherwise.

    boolean addNewEntry(T newEntry);
    // adds a new entry to the bag. Returns true of accepted, false otherwise.

    T remove();
    // removes an unspecified entry from the bag, if possible. Returns the removed entry, or null if the bag is empty.

    boolean remove(T anEntry);
    // removes one occurrence of a given entry from the bag, if possible. Returns the removed entry, or null if not found.

    void clear();
    // removes all entries from the bag.

    int getFrequencyOf(T anEntry);
    // counts the number of times a given entry appears in the bag.

    boolean contains(T anEntry);
    // tests whether the bag contains a given entry.
    
    T[] toArray();
    // returns an array containing all the entries in the bag.

}