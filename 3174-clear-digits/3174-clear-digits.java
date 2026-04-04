class Solution {
    public String clearDigits(String s) {
     Stack<Character>st=new Stack<>();
     StringBuilder sb=new StringBuilder();
     for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(c>='0'&&c<='9'){
            st.pop();
        }
        else{
            st.push(c);
        }
     }
     while(!st.isEmpty()){
        sb.append(st.pop());
     }
        sb.reverse();
     
     return sb.toString();
    }
}