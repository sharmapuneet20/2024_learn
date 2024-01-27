int no = 0;
        if(n%2==0){
            //even
            no = n;
        }else{
            no = n-1;
        }
        
        for(int i=0; i<no; i=i+2){
    
            
          int temp = a[i];
          a[i] = a[i+1];
          a[i+1] = temp;
            
        }
        

