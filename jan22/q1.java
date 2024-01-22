class Compute 
{
    static Pair getMinMax(long a[], long n)  {
        long max = Long.MIN_VALUE ; 
        long min = Long.MAX_VALUE ;
        
        for(int i = 0 ; i< a.length; i++){
            if(a[i]> max){
                max = a[i];
            }
            
            if(a[i]< min){
                min = a[i];
            }
        }
      
        return new Pair(min, max);
    }
    
}
