class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;  // 0 → 0, 1 → 1

        int left = 1, right = x / 2, ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long sq = (long) mid * mid; // use long to prevent overflow

            if (sq == x) return mid;
            else if (sq < x) {
                ans = mid;       // mid is a candidate
                left = mid + 1;  // search right
            } else {
                right = mid - 1; // search left
            }
        }

        return ans;
    }
}

