//Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.


class Solution {
    int missingNumber(int array[], int n) {
        // Your Code Here
     int sum2 = n*(n+1)/2;
      
      int sum1=0;
      for(int i=0; i<array.length; i++){
          sum1 += array[i];
      }
    return sum2 - sum1;
}
}
