class Solution {
    public static boolean isPalindrome(int x) {
    if (x < 0 || (x != 0 && x % 10 == 0)) {
        return false;
    }
    int r = 0;
    int o = x;
    while ( o > r ) {
        r = r * 10 + o % 10;
        o /= 10;
    }
    return (o == r) || (o == r/10);
}
}