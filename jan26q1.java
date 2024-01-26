public static boolean isAnagram(String a,String b)
    {
        if(a.length()!=b.length())
        return false;
        char [] a1=a.toCharArray();
        char [] a2=b.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        for(int i=0;i<a1.length;i++){
            if(a1[i]!=a2[i])
            return false;
        }
        return true;
        
    }
}
