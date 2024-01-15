import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] x = new int[n];
        int[] y = new int[n];
        
        for(int i=0;i<n;i++){
            x[i] = scn.nextInt();
        } 
        
        for(int i=0;i<n;i++){
            y[i] = scn.nextInt();
        } 
        
        System.out.println(Max_Points(x,y));
    }
    

   
    static long Max_Points(int[] X, int[] Y){
        HashSet<String> hs = new HashSet<>();
        
        for(int i=0;i<X.length;i++){
            hs.add(X[i]+" "+Y[i]);
        }
       return hs.size();

    }
    }
