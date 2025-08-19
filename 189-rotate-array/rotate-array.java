class Solution {
    public void rotate(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        k = k%nums.length;
        int offset = k;
        int count = 0;
        for(int i = nums.length-1;i>=0;i--){
            if(count<k){
                list.add(nums[i]);
                count++;
            }else{
                nums[i+offset]=nums[i];
            }
        }
        for(int i = 0;i<k;i++){
            nums[i]=list.get(list.size()-1-i);
        }
    }
}