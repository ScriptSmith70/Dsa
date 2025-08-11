class Solution {
    public boolean isPowerOfThree(int n) {
        if(n < 1) return false;
        for(int i=0; Math.pow(3,i)<=n; i++){
            if(Math.pow(3,i) == n) return true;
        }
        return false;
    }
}
/*
class Solution {

    public boolean isPowerOfThree(int n) {

        // 3^19 = 1162261467 

        return n > 0 && (1162261467  % n) == 0;
        
    }
}
*/