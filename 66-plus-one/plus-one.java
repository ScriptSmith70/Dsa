class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse from last digit backwards
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                // If current digit is less than 9, just increment and return
                digits[i]++;
                return digits;
            } else {
                // If current digit is 9, set to 0 and carry 1 forward
                digits[i] = 0;
            }
        }

        // If all digits were 9, we need an extra digit at the front
        int[] result = new int[n + 1];
        result[0] = 1; // the carry goes here
        // explicitly set the rest to 0
        for (int i = 1; i < result.length; i++) {
            result[i] = 0;
        }

        return result;
    }
}
