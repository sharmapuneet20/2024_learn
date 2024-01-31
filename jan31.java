   public static long[] printFibb(int n) 
    {
       long[] fibArray = new long[n];
        long n1 = 0, n2 = 1;

        for (int i = 0; i < n; i++) {
            fibArray[i] = n2;
            long sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }

        return fibArray;
    
    }
}
