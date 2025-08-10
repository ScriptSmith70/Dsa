class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}

/*
class Solution {
    public boolean isPowerOfTwo(int n) {

        if (n <= 0) return false;

        for(int x=0;x<31;x++){
        if(n==Math.pow(2, x)){
            return true;
          }
        }
        return false;
    }
*/
