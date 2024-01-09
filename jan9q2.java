// isprime optimization
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;
        if(n<2){
             System.out.println("Nay");
        }
        for(int i=1; i*i<=n; i++){
            if(n%i==0){
                if(i!=n/i){
                    count+=2;
                }else{
                    count++;
                }
            }
        }
        if(count==2){
            System.out.println("Yay");
        }else{
                System.out.println("Nay");

        }
    }
}
