class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        // prefix pass (from left to right)
        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        // suffix pass (from right to left, using one variable)
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= suffix;
            suffix *= nums[i];
        }

        return ans;
    }
}



/* class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        
        int product = 1;
        int zeroCount = 0;
        
        // Step 1: Compute product of non-zero elements and count zeros
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                product *= num;
            }
        }
        
        // Step 2: Handle cases
        for (int i = 0; i < n; i++) {
            if (zeroCount > 1) {
                ans[i] = 0; // More than one zero → all results zero
            } else if (zeroCount == 1) {
                if (nums[i] == 0) {
                    ans[i] = product; // Only zero gets product
                } else {
                    ans[i] = 0;
                }
            } else {
                ans[i] = product / nums[i]; // Normal case, no zeros
            }
        }
        
        return ans;
    }
}

*/