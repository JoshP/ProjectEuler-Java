/*
The following algorithm generates the next permutation lexicographically after a given permutation. 
It changes the given permutation in-place.
Find the largest index k such that a[k] < a[k + 1]. If no such index exists, 
the permutation is the last permutation.
Find the largest index l such that a[k] < a[l]. Since k + 1 is such an index, 
l is well defined and satisfies k < l.
Swap a[k] with a[l].
Reverse the sequence from a[k + 1] up to and including the final element a[n].
*/
import java.util.*;
import java.math.*;

 public class Sol24 extends BaseSolution {
    public void runSolution() {
        int[] initial = new int[]{0,1,2,3,4,5,6,7,8,9};
        int count = 1;
        while (count != 1000000) {
            count++;
            next(initial);    
        }   
        printArray(initial);        
    }

    public void next(int[] a) {
        int k = -1;
        for (int i = 0; i < a.length; i++) { // TODO reverse?
            if (i < a.length - 1 && a[i] < a[i + 1])
                k = i;
        }
        if (k == -1) {
            System.out.println("found last");
            return;
        }
        int l = k + 1;
        for (int i = l; i < a.length; i++) {
            if (a[k] < a[i])
                l = i;
        }
        swap(k, l, a);
        for (int i = k + 1, end = ((a.length - k + 1) / 2) + k; i < end; i++) {
            swap(i, a.length - i + k, a);
        }
    }

    public void printArray(int[] a) {
        for (int i : a) {
            System.out.print(i);
        }     
        System.out.println();        
    }

    public void swap(int i, int j, int[] a) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;        
    }
}
 
