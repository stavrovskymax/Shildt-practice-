package qpack;

public interface ICharQ {
    // Put a character in the queue
    void put(char ch);
    
    // Get a character from the queue
    char get();

    // Reset the queue
    void reset();

}