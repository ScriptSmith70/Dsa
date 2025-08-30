/* Three ways to count digits in a number 

Using Division (while loop) 
static int digits(int num) {
    int count = 0;
    while (num > 0) {
        count++;
        num /= 10;
    }
    return count;
}

Using String Conversion
static int digits(int num) {
    return String.valueOf(num).length();
}

Using Logarithm
static int digits(int num) {
    return (int) (Math.log10(num) + 1);
}

*/
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (digits(nums[i]) % 2 == 0) {
                count++;
            }
        }
        return count;
    }


    static int digits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}
