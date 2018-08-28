package qpack;

// Fixed queue
public class FixedQueue implements ICharQ {
    private char q[]; // array for stoting queue elements
    private int putloc, getloc; // put and get elements

    // Create empty queue of specific size
    public FixedQueue(int size) {
        q = new char[size+1]; // allocate memory for the queue
        putloc = getloc = 0;
    }
    
    @Override 
    // Put a character in the queue
    public void put(char ch) {
        if (putloc == q.length-1) {
            System.out.println(" - Queue is full");
            return;
        }
        
        putloc++;
        q[putloc] = ch;
    }
    
    @Override
    // Get character from the queue
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty");
            return (char) 0;
        }
        
        getloc++;
        return q[getloc];
    }
    
    @Override
    // Reset the queue
    public void reset() {
        for (int i=0; i < q.length; i++) {
            q[i] = ' ';
            putloc = getloc = 0;
        }
    }
}