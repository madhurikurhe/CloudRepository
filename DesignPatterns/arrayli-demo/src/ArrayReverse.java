
import java.util.Arrays;

public class ArrayReverse {

 public static void main(String[] args) {

  ArrayReverse ar = new ArrayReverse();

  int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}; 
  ar.reverseArray(a);

 }

 private void reverseArray(int[] a) {  
  int middle = a.length /2;
  int i = 0, j = a.length - 1, temp = 0;
  
  for(; i < middle; i++,j--) {
   temp = a[i];
   a[i] = a[j];
   a[j] = temp;
  }
  
  System.out.println(Arrays.toString(a));
 }
}