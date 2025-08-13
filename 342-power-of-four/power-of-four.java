class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0) return false;
        return pow(n);
    }
    public static boolean pow(int n){
        if(n == 1) return true;
        if(n%4 !=0) return false;
        return pow(n/4);
    }
}

/* 

        if(n==1) return true;
        else if(n<=0) return false;
        return isPowerOfFour((double)n/4);

*/