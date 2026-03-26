class Solution {
    public int minimumDifference(int[] nums, int k) {
        int ans=Integer.MAX_VALUE;
        Arrays.sort(nums);
        int l=0;
        for(int r=0;r<nums.length;r++){
            if(r-l==k){
               l++;
            }
            if(r-l+1==k){
                int temp=nums[r]-nums[l];
                ans=Math.min(temp,ans);
            }
        }
        return ans;
    }
}