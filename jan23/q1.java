// A matrix is constructed of size n*n. such that Mi,j= i+j. Count the number of cells having value q.

class Solution {
    static long sumMatrix(long n, long q) {
        // code here
        // for(int i=0; i<n; i++){
            
        //     for(int j=0; j<q; j++){
        //         if([n][j]==){
        //             count++;
        //         }
        //     }
        
            
        // }
    
        // return count;
          if(q > 2*n) return 0;
        long x = (2 + 2*n)/2;
        return n-Math.abs(x - q);
    }
    
};
