class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int[] arr = new int[2];
        
        for (int a = 0; a < n - 1; a++) {
            for (int b = a + 1; b < n; b++) {
                if (numbers[a] + numbers[b] == target) {
                    arr[0] = a + 1;
                    arr[1] = b + 1;
                    return arr;
                }
            }
        }
        
        return arr;
    }
}
