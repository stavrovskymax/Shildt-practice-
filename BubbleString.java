class BubbleString {
 public static void main(String args[]) {
  String strs[] = {"this", "is", "a", "test", "of", "string", "sotr"};
  String b;
  int i, j, r;
  

  int size = strs.length;


  for(i=1; i < size; i++) {
   for(j=0; j < size-1; j++) {
    r = strs[j].compareTo(strs[j+1]);
    if (r > 0) { 
     b = strs[j];
     strs[j] = strs[j+1];
     strs[j+1] = b; 
    }
   }
  }
  for(i=0; i < size; i++) {
   System.out.print(strs[i] + " ");
  }
 }
}