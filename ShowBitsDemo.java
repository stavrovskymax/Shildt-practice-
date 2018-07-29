class ShowBits {
 int numЬits;
 
 ShowBits (int n) {
  numЬits = n;
 }

 void show(long val) {
  long mask = 1;
  
  mask <<= numЬits-1;
  
  int spacer = 0;
  for(; mask != 0; mask >>>= 1) {
   if((val & mask) != 0) System.out.print("l");
   else System.out.print("0");
   spacer++;
   if((spacer % 8) == 0) {
    System.out.print(" ");
    spacer = 0;
   }
  }
  System.out.println();
 }
}

class ShowBitsDemo {
 public static void main(String args[]) {
  ShowBits b = new ShowBits(8);
  ShowBits i = new ShowBits(32);
  ShowBits li = new ShowBits(64);
    
  System.out.println("123 в двоичном представлении: ");
  b.show(123);
    
  System.out.println("\n87987 в двоичном представлении: ");
  i.show(87987);

  System.out.println("\n237658768 в двоичном представлении: ");
  li.show(237658768);

  System.out.println("\nМлaдшиe 8 битов числа 87987 в двоичном представлении: ");
  b.show(87987);
 }
}