class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> charList = new ArrayList<Character>();
        int longest = 0;
        for(char c: s.toCharArray()){
            if(charList.contains(c)){
                if(longest < charList.size()){
                    longest = charList.size();
                }
                while(charList.contains(c)){
                    charList.remove(0);
                }
            }
            charList.add(c);
        }
        if(longest < charList.size()){
            longest = charList.size();
        }
        return longest;
    }
}