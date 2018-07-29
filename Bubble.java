class Bubble{
 public static void main(String args[]) {
  int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
  int i, j, b = 0;

  int size = nums.length;

  for(i=1; i < size-1; i++) {
   for(j=0; j < size-1; j++) {
    if (nums[j] > nums[j+1]) { 
     b = nums[j];
     nums[j] = nums[j+1];
     nums[j+1] = b; 
    }
   }
  }
  for(i=0; i < size; i++) {
   System.out.print(nums[i] + " ");
  }
 }
}             