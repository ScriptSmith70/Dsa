class Solution {

    private Random rand = new Random();
    private int[] a;

    public Solution(int[] a) {
        this.a = a;
    }
    
    public int pick(int target) {
        int index = rand.nextInt(a.length);
        return a[index] == target ? index : pick(target);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */