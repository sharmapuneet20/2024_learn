   public static boolean isPowerofTwo(long n){
        
        // Your code here
        double x;
        if(n==1) {
            return true;
        }
        for(int i=1;i<=100;i++) {
            x=Math.pow(2, i);
            if(x==n) {
                return true;
            }
            else {
                continue;
            }
        }
        return false;
        
        
    }
    
}
