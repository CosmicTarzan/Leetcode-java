class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        Boolean done = false;
        for(int i = 0; i < strs[0].length(); i++){
            char c = strs[0].charAt(i);
            for(String s: strs){
                if(s.length() - 1 < i){
                    done = true;
                    break;
                }
                if (s.charAt(i) != c){
                    done = true;
                    break;
                }
            }
            if(done){
                break;
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
