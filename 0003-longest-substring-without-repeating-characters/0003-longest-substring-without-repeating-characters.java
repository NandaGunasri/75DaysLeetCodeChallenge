class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] map = new int[256]; // ASCII
        Arrays.fill(map, -1);
        
        int left = 0, maxLen = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            
            if (map[ch] >= left) {
                left = map[ch] + 1;
            }
            
            map[ch] = right;
            maxLen = Math.max(maxLen, right - left + 1);
        }
        
        return maxLen;
    }
}