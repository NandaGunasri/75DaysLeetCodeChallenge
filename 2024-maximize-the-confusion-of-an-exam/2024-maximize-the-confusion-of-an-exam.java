class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
      int l=0;
      int temp1=0;
      int temp2=0;
      int ans=0;
      int n=answerKey.length();
      for(int r=0;r<n;r++){
         char ch = answerKey.charAt(r);
        if(ch=='T'){
            temp1++;
        }
        else{
            temp2++;
        }
        while(Math.min(temp1,temp2)>k){
            char left=answerKey.charAt(l);
            if(left=='T'){
                temp1--;
            }
            else{
                temp2--;
            }
            l++;
        }
        ans=Math.max(ans,r-l+1);
      }  
      return ans;
    }
}