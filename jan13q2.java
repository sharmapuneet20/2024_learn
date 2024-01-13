import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(insert(str));
          
    }
    private static String insert(String str){
        String ans ="";
        int n = str.length();
        for(int i=0;i< str.length()-1; i++){
            ans = ans + str.charAt(i);
            int temp = str.charAt(i+1) - str.charAt(i);
            ans = ans + temp;
        }
        ans = ans + str.charAt(n-1);
        return ans;
    }
}
