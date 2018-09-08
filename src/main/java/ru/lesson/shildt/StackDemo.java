package ru.lesson.shildt;

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
   pop(a[i]);      
 }
 
 Stack(Stack ob) {
  putloc = ob.putloc;
  stck = new char[ob.stck.length];
  
  for(int i=0; i < ob.stck.length; i++)
   stck[i] = ob.stck[i];      
 } 
     
 void pop(char ch) {
  if (putloc==stck.length) {
   System.out.println(" - Стек пуст");
   return;
  }
  stck[putloc] = ch;
  putloc++;
 }
 
 int getPutloc() {
  return putloc;
 }

 char push() {
  if (putloc == 0) {
   System.out.println(" - Стек заполнен");
   return (char) 0;
  }
  putloc--;
  return stck[putloc];
 }
}
class StackDemo {
 public static void main(String args[]) {
 
  Stack q1 = new Stack(10);
  
  char name[] = {'T', 'o', 'm'};
  Stack q2 = new Stack(name);
  
  char ch;
  int i;

  System.out.print("Стек q1: ");
  
  for(i=0; i < 10; i++) {
   q1.pop((char) ('A' + i));
   System.out.print(q1.getPutloc() + " ");
  }
  
  Stack q3 = new Stack(q1);
  System.out.println("\n");

  System.out.print("Содержимое  q1: ");
  for(i=0; i < 10; i++) {
   ch = q1.push();
   if (ch != (char) 0) System.out.print(ch);
  }
               
  System.out.println("\n");
  
  System.out.print("Содрежимое q2: ");
  for(i=0; i < 3; i++) {
   ch = q2.push();
   if (ch != (char) 0) System.out.print(ch);
  }
  
  System.out.println("\n");
  
  System.out.print("Содержимое q3: ");
  for(i=0; i < 10; i++) {
   ch = q3.push();
   if (ch != (char) 0) System.out.print(ch);
  }
 }
}	