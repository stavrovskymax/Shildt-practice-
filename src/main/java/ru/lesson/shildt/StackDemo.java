package ru.lesson.shildt;

class StackFullException extends Exception {
 int size;

 public StackFullException(int size) {
  this.size = size;
 }

 @Override
 public String toString() {
  return "The stack is full. Max size is " + size;
 }
}

class StackEmptyException extends Exception {

 @Override
 public String toString() {
  return "The stack is empty.";
 }
}

class Stack {
 private char stck[];
 private int putloc;

 Stack(int size) {
  stck = new char[size];
  putloc = 0;
 }

 Stack(char a[]) {
  putloc = 0;
  stck = new char[a.length];

  for(int i=0; i < a.length; i++)
   try {
    push(a[i]);
   }

   catch (StackFullException exc) {
   System.out.println(exc);
   }
 }

 Stack(Stack ob) {
  putloc = ob.putloc;
  stck = new char[ob.stck.length];

  for(int i=0; i < ob.stck.length; i++)
   stck[i] = ob.stck[i];
 }

 void push(char ch) throws StackFullException {
  if (putloc==stck.length) {
   throw new StackFullException(stck.length);
  }
  stck[putloc] = ch;
  putloc++;
 }

 char pop() throws StackEmptyException {
  if (putloc == 0) {
   throw new StackEmptyException();
  }
  putloc--;
  return stck[putloc];
 }
}
class StackDemo {
 public static void main(String args[]) {

  try {
   Stack q1 = new Stack(10);

   char name[] = {'T', 'o', 'm'};
   Stack q2 = new Stack(name);

   char ch;
   int i;

   System.out.print("Стек q1: ");

   for (i = 0; i < 10; i++) {
    q1.push((char) ('A' + i));
   }

   Stack q3 = new Stack(5);
   System.out.println("\n");

   System.out.print("Содержимое  q1: ");
   for (i = 0; i < 10; i++) {
    ch = q1.pop();
    if (ch != (char) 0) System.out.print(ch);
   }

   System.out.println("\n");

   System.out.print("Содрежимое q2: ");
   for (i = 0; i < 3; i++) {
    ch = q2.pop();
    if (ch != (char) 0) System.out.print(ch);
   }

   System.out.println("\n");

   System.out.print("Содержимое q3: ");
   for (i = 0; i < 10; i++) {
    ch = q3.pop();
    if (ch != (char) 0) System.out.print(ch);
   }
  }
  catch (StackFullException | StackEmptyException exc) {
   System.out.println(exc);
  }
  }
 }