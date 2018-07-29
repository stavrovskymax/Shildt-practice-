class Queue {
 private char q[];
 private int putloc, getloc;

 Queue(int size) {
  q = new char[size+1];
  putloc = getloc = 0;
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
class QDemo {
 public static void main(String args[]) {
 
  Queue bigQ = new Queue(100);
  Queue smallQ = new Queue(4);
  char ch;
  int i;

  System.out.println("Использование очереди bigQ для сохранения алфавита");

  System.out.println();

  System.out.print("Индекс вставки данных в очередь: ");
  
  for(i=0; i < 26; i++) {
   bigQ.put((char) ('A' + i));
   System.out.print(bigQ.getPutloc() + " ");
  }

  System.out.println("\n");

  System.out.println("Содержимое очереди bigQ: ");
  for(i=0; i < 26; i++) {
   ch = bigQ.get();
   if (ch != (char) 0) System.out.print(ch);
  }

  System.out.println("\n");
  
  System.out.println("Использование очереди smallQ для генерации ошибок");

  for(i=0; i < 5; i++) {
   System.out.print("Попытка сохранения " + (char) ('Z' - i));
   smallQ.put((char) ('Z' - i));
   System.out.println();
  }

  System.out.println();
  
  System.out.print("Содержимое очереди smallQ: ");
  for(i=0; i < 5; i++) {
   ch = smallQ.get();
   if (ch != (char) 0) System.out.print(ch);
  }
 }
}	