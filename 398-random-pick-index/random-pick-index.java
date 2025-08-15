import java.util.*;

class Solution {
    Map<Integer, List<Integer>> mp;
    Random rand;

    public Solution(int[] nums) {
        mp = new HashMap<>();
        rand = new Random();
        for (int i = 0; i < nums.length; i++) {
            mp.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
    }
    
    public int pick(int target) {
        List<Integer> indices = mp.get(target);
        int idx = rand.nextInt(indices.size());
        return indices.get(idx);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */