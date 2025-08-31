/* class Solution {
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

*/


class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int total = numbers[left] + numbers[right];

            if (total == target) {
                return new int[]{left + 1, right + 1};
            } else if (total > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{-1, -1}; // If no solution is found        
    }
}
