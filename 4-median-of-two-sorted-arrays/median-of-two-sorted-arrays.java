class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int []nums=new int[nums1.length+nums2.length];

        for(int i=0;i<nums1.length;i++){
            nums[i]=nums1[i];
        }

        int z=nums1.length;

        for(int i=0;i<nums2.length;i++){
            nums[z]=nums2[i];
            z++;
        }

        Arrays.sort(nums);
        double ans=0;
        if(nums.length%2!=0){
            return nums[nums.length/2];
        }
        else{
            int middle=nums.length/2;

             ans=(nums[middle]+nums[middle-1])/2.0;
        }
        return ans;
    }
}