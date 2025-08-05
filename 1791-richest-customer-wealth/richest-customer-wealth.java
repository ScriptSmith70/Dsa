class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for (int[] x : accounts) {
            int temp=0;
            for(int z:x){
                temp+=z;
            }
            if (temp>max) {
                max=temp;
            }
        }
        return max;
    }
}