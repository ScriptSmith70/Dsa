class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (digits(nums[i]) % 2 == 0) { // call helper method
                count++;
            }
        }
        return count;
    }

    // helper method to count digits
    static int digits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}
