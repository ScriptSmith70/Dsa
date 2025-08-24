class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int index = 0;
        
        for (int i = 0; i < n; i++) {
            result[index++] = nums[i];     // xᵢ
            result[index++] = nums[i + n]; // yᵢ
        }
        
        return result;
    }
}
