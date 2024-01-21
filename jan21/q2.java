class Solution {
    public int mySqrt(int x) {
        int s = 0 ;
        int e = x;
        if(x <2){
            return x;
        }
        while(s<=e){
            int mid = (s + e) / 2;
            if(mid  < (x / mid)){
                s  = mid +1;
            }else if(mid  > ( x /mid)){
                e = mid -1;
            }else{
                return mid;
            }
        }
        return e;
    }
}
