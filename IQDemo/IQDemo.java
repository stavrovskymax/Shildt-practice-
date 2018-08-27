import qpack.*;

public class IQDemo {
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