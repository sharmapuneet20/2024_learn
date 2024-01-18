import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int M = sc.nextInt();
        System.out.println(firstindex(arr, 0, M));

    }
      public static int firstindex(int arr[] , int index , int M){
          if(index == arr.length){
              return -1;
          }
          int temp = firstindex(arr, index +1 , M);
          if(arr[index] == M){
              return index;
          }
          else{
              return temp;
          }
      }
}
