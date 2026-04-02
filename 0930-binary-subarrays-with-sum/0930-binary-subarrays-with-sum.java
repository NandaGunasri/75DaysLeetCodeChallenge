class Solution {
    public int atmost(int[] nums, int goal) {
        int l=0;
        int temp=0;
        int ans=0;
        if(goal<0){  //edgecase
            return 0;
        }
        for(int r=0;r<nums.length;r++){
            if(nums[r]==1){
                temp++;
            }
            while(temp>goal){
                if(nums[l]==1){
                temp--;
                }
                l++;
            }
            ans+=r-l+1;
        }
        return ans;
    }
     public int numSubarraysWithSum(int[] nums, int goal) {
        int res=atmost(nums,goal)-atmost(nums,goal-1);
        return res;
    }
}