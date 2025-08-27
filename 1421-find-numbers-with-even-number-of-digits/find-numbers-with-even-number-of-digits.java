class Solution {
    public int findNumbers(int[] nums) {
        int total = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            if((int) (Math.log10(nums[i]) + 1 ) % 2 == 0){
                total++ ;
            }
        }
        return total ;
        
    }
   
}

/*
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i : nums) {
            String s = Integer.toString(i);
            if (s.length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
*/