class Queue {
 private char q[];
 private int putloc, getloc;

 Queue(int size) {
  q = new char[size+1];
  putloc = getloc = 0;
 }
    
 Queue(char a[]) {
  putloc = 0;
  getloc = 0;
  q = new char[a.length+1];
  
  for(int i=0; i < a.length; i++)
   put(a[i]);      
 }
 
 Queue(Queue ob) {
  putloc = ob.putloc;
  getloc = ob.getloc;
  q = new char[ob.q.length];
  
  for(int i =getloc+1; i<=putloc; i++)
   q[i] = ob.q[i];      
 } 
     
 void put(char ch) {
  if (putloc==q.length-1) {
   System.out.println(" - Очередь заполнена");
   return;
  }
  putloc++;
  q[putloc] = ch;
 }
 
 int getPutloc() {
  return putloc;
 }
 
 char get() {
  if (getloc == putloc) {
   System.out.println(" - Очередь пуста");
   return (char) 0;
  }
  getloc++;
  return q[getloc];
 }
}
class QDemo2 {
 public static void main(String args[]) {
 
  Queue q1 = new Queue(10);
  
  char name[] = {'T', 'o', 'm'};
  Queue q2 = new Queue(name);
  
  char ch;
  int i;

  System.out.print("Индекс вставки данных в очередь q1: ");
  
  for(i=0; i < 10; i++) {
   q1.put((char) ('A' + i));
   System.out.print(q1.getPutloc() + " ");
  }
  
  Queue q3 = new Queue(q1);
  System.out.println("\n");

  System.out.print("Содержимое очереди q1: ");
  for(i=0; i < 10; i++) {
   ch = q1.get();
   if (ch != (char) 0) System.out.print(ch);
  }
               
  System.out.println("\n");
  
  System.out.print("Содержимое очереди q2: ");
  for(i=0; i < 3; i++) {
   ch = q2.get();
   if (ch != (char) 0) System.out.print(ch);
  }
  
  System.out.println("\n");
  
  System.out.print("Содержимое очереди q3: ");
  for(i=0; i < 10; i++) {
   ch = q3.get();
   if (ch != (char) 0) System.out.print(ch);
  }
 }
}	