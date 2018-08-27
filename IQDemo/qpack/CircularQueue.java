package qpack;

// Circular queue
public class CircularQueue implements ICharQ {
    private char q[]; // array for storing queue elements
    private int putloc, getloc; // index of inserted and extracted elements
    
    // create empty queue of specific size
    public CircularQueue(int size) {
        q = new char[size+1]; // allocate memory for the queue
        putloc = getloc = 0;
    }
    
     // put a character in the queue
    public void put(char ch) {
        if (putloc+1 == getloc | ((putloc == q.length-1) & (getloc==0))) {
            System.out.println(" - Queue is full");
            return;
        }
        
        putloc++;
        if (putloc == q.length) {
            putloc = 0; // back to the beginning of the array
        }
        q[putloc] = ch;
    }
    
    // extract character from the queue
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty");
            return (char) 0;
        }
        
        getloc++;
        if (getloc == q.length) {
            getloc = 0; // back to the beginning of the queue
        }
          return q[getloc];
    }
    
    // reset the queue
    public void reset() {
        for (int i=0; i < q.length; i++) {
            q[i] = ' ';
            putloc = getloc = 0;
        }
    }
}