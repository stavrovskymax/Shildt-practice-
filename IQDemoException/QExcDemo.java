class QueueFullException extends Exception {
    int size;

    QueueFullException(int size) {
        this.size = size;
    }

    public String toString() {
        return "\nQueue is full. Max size of queue: " + size;
    }
}

class QueueEmtyException extends Exception {

    public String toString(){
        return "\nQueue is empty.";
    }
}

class QExcDemo {
    public static void main(String args[]) {
        FixedQueue q = new FixedQueue(10);
        char ch;
        int i;

        try {
            // Overflow the queue
            for (i=0; i < 11; i++) {
                System.out.print("Try the queue: " + (char) ('A' + i));
                q.put((char) ('A' + i));
                System.out.println(" - OK");
            }
            System.out.println();
        }
        catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            // Try to get character from the emty queue
            for (i=0; i < 11; i++) {
                System.out.print("Get a character: ");
                ch = q.get();
                System.out.println(ch);
            }
        }
        catch (QueueEmtyException exc) {
            System.out.println(exc);
        }
    }
}