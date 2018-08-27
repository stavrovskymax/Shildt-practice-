package qpack;

// Dynamic circular queue
public class DinCircularQueue implements ICharQ {
    private char q[]; // array for storing queue elements
    private int putloc, getloc, size; // index of inserted and extracted elements 
    
    // create empty queue of specific size
    public DinCircularQueue(int size) {
        q = new char[size+1]; // allocate memory for the queue
        putloc = getloc = 0;
        this.size = size;
    }
    
     // put a character in the queue
    public void put(char ch) {  
        if (putloc == q.length-1) {
            // increase the size of the array
            char t[] = new char[q.length * 2];
            
            // Copy elements to a new queue
            for (int i=0; i < q.length; i++)
                t[i] = q[i];
            q = t;
            putloc = 0;
            getloc = 0;
        }
        
        putloc++;
        q[putloc] = ch;
    }
    
    // extract character from the queue
    public char get() {
        getloc++;
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