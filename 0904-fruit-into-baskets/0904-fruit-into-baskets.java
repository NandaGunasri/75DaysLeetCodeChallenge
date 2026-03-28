class Solution {
    public int totalFruit(int[] fruits) {
       int l=0;
       int ans=0;
       HashMap<Integer,Integer>hs=new HashMap<>();
       for(int r=0;r<fruits.length;r++){
       int ch=fruits[r];
       hs.put(ch,hs.getOrDefault(ch,0)+1);
        while(hs.size()>2){
          {
            int ls=fruits[l];
            hs.put(ls,hs.get(ls)-1);
            if(hs.get(ls)==0)
            hs.remove(ls);
          }
            l++;
        }
        ans=Math.max(r-l+1,ans);
       } 
       return ans;
    }
}