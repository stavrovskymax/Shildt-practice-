abstract class ICharQ {
    
    abstract void put(char ch);
    
    abstract char get();
    
    abstract void reset();
}

// Fixed queue
class FixedQueue extends ICharQ {
    private char q[]; // array for stoting queue elements
    private int putloc, getloc; // index of inserted and extracted elements
    
    // create empty queue of specific size
    public FixedQueue(int size) {
        q = new char[size+1]; // allocate memory for the queue
        putloc = getloc = 0;
    }
    
    // put a character in the queue
    public void put(char ch) {
        if (putloc == q.length-1) {
            System.out.println(" - Queue is full");
            return;
        }
        
        putloc++;
        q[putloc] = ch;
    }
    
    // extract character from the queue
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty");
            return (char) 0;
        }
        
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

// Circular queue
class CircularQueue extends ICharQ {
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
    
// Dynamic queue
class DinQueue extends ICharQ {
    private char q[]; // array for storing queue elements
    private int putloc, getloc; // index of inserted and extracted elements
    
    // create empty queue of specific size
    public DinQueue(int size) {
        q = new char[size+1]; // allocate memory for the queue
        putloc = getloc = 0;
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
        }
        
        putloc++;
        q[putloc] = ch;
    }
    
    // extract character from the queue
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty");
            return (char) 0;
        }
        
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
    
// Dynamic circular queue
class DinCircularQueue extends ICharQ {
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
 
class QDemo {
    public static void main(String args[]) {
        FixedQueue q1 = new FixedQueue(10);
        DinQueue q2 = new DinQueue(5);
        CircularQueue q3 = new CircularQueue(10);
        DinCircularQueue q4 = new DinCircularQueue(5);
        
        ICharQ iq;
        
        char ch;
        int i;
        
        iq = q1;
        // put a series of characters in fixed-size queue
        for (i=0; i < 10; i++) {
            iq.put((char) ('A' + i));
        }
        
        // display a queue content
        System.out.print("Contents of the fixed queue: ");
        for (i=0; i < 10; i++) {
            ch = iq.get();
            System.out.print(ch);
        }
        
        System.out.println("\nReset the fixed queue: ");
        
        iq.reset();
        
        // put a series of characters in fixed-size queue
        for (i=0; i < 10; i++) {
            iq.put((char) ('A' + i));
        }
        
        // display a queue content
        System.out.print("Contents of the fixed queue: ");
        for (i=0; i < 10; i++) {
            ch = iq.get();
            System.out.print(ch);
        }
        
        System.out.println();
        
        iq = q2;
        // put a series of characters in dynamic-size queue
        for (i=0; i < 10; i++) {
            iq.put((char) ('Z' - i));
        }
        
        // Display a queue content
        System.out.print("Contents of the dynamic queue: ");
        for (i=0; i < 10; i++) {
            ch = iq.get();
            System.out.print(ch);
        }
        
        System.out.println();
        
        iq = q3;
        // put a series of characters in circular-size queue
        for (i=0; i < 10; i++) {
            iq.put((char) ('A' + i));
        }
        
        // Display a queue content
        System.out.print("Contents of the circular queue: ");
        for (i=0; i < 10; i++) {
            ch = iq.get();
            System.out.print(ch);
        }
        
        System.out.println();
        
        // put more series of characters in circular queue
        for (i=10; i < 20; i++) {
            iq.put((char) ('A' + i));
        }
        
        // Display a queue content
        System.out.print("Contents of the circular queue: ");
        for (i=0; i < 10; i++) {
            ch = iq.get();
            System.out.print(ch);
        }
        
        System.out.println("\nSaving and using data" + 
                          " of the circular queue");
        
        // put a characters in circular queue and extract them from there 
        for (i=0; i < 20; i++) {
            iq.put((char) ('A' + i));
            ch = iq.get();
            System.out.print(ch);
        }
        
        System.out.println();
        
        iq = q4;
        // put a series of characters in dinamic-circular size queue
        for (i=0; i < 5; i++) {
            iq.put((char) ('A' + i));
        }
        
        // Display a queue content
        System.out.print("Contents of the Dynamic-circular queue: ");
        for (i=0; i < 5; i++) {
            ch = iq.get();
            System.out.print(ch);
        }
        
        System.out.println();
        
        // put more series of characters in Dynamic-circular queue
        for (i=5; i < 10; i++) {
            iq.put((char) ('A' + i));
        }
        
        // Display a queue content
        System.out.print("Contents of the Dynamic-circular queue: ");
        for (i=0; i < 5; i++) {
            ch = iq.get();
            System.out.print(ch);
        }
        
        System.out.println("\nSaving and using data" + 
                          " of the Dynamic-circular queue");
        
        // put a characters in Dynamic-circular queue and extract them from there 
        for (i=0; i < 20; i++) {
            iq.put((char) ('A' + i));
            ch = iq.get();
            System.out.print(ch);
        }
    }
}