package ru.lesson.shildt;

class Quicksort {
    
    static void qsort(char items[]) {
        qs(items, 0, items.length-1);
    }
                      
    private static void qs(char items[], int left, int right) {
        int i, j;
        char x, y;
        
        i = left; j = right;
        x = items[(left+right)/2];
        
        System.out.println("Порядок следования: " + x);
        
        do {
            while((items[i] < x) && (i < right)) i++;
            while((x < items[j]) && (j > left)) j--;
            
            if(i <= j) {
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                System.out.println(items[i] + " " + items[j]);
                i++; j--;
            }
        } while(i <= j);
        
        if(left < j) qs(items, left, j);
        if(i < right) qs(items, i, right);
    }
}

class SortDemo{
    public static void main(String args[]) {
        char a[] = {'d', 'x', 'a', 'r', 'p', 'j', 'i'};
        int i;
        
        System.out.print("До сортировки: ");
        for(i=0; i < a.length; i++)
            System.out.print(a[i]);
        
        System.out.println();
        
        Quicksort.qsort(a);
        
        System.out.print("После сортировки: ");
        for(i=0; i < a.length; i++)
            System.out.print(a[i]);
    }
}