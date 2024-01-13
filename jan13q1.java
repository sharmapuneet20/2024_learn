import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String st=scn.nextLine();
        
        char[] ch = st.toCharArray();
        reverse(ch);
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
        }
    }

    private static void reverse(char[]ch) {
        
       int sp =0;
       int ep = ch.length - 1;
        
       while(sp < ep){
           char temp = ch[sp];
           ch[sp] = ch[ep];
           ch[ep] = temp;
           sp++;
           ep--;
       }
        
        

    }
}
