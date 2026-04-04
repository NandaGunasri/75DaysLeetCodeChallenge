class Solution {
    public int maxDepth(String s) {
        Stack<Character> st=new Stack<>();
        int ans=0;
        for(int i=0;i<s.length();i++){
            char sa=s.charAt(i);
            if(sa=='(')
            st.push('(');
            else if(sa==')')
            st.pop();
               ans= Math.max(ans,st.size());
        }
    
       return ans;
    }
}