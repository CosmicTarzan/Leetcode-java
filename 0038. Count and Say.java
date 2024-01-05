public class Solution {
    public String countAndSay(int n) {
        StringBuilder ans = new StringBuilder("1");
        StringBuilder prev;
        int count;
        char say;
        for (int i = 1; i < n; i++){
            prev = ans;
            ans = new StringBuilder();       
            count = 1;
            say = prev.charAt(0);
            
            for (int j = 1, len = prev.length(); j < len; j++){
                if (prev.charAt(j) != say){
                    ans.append(count).append(say);
                    count = 1;
                    say = prev.charAt(j);
                }
                else count++;
            }
            ans.append(count).append(say);
        }	       	        
        return ans.toString();
    }
}
