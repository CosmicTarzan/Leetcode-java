class Solution {
    public String longestPalindrome(String s) {
        StringBuilder longest = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for(char c: s.toCharArray()){
            temp.append(c);
            StringBuilder temp1 = new StringBuilder(temp);
            temp1.reverse();
            if(temp.toString().equals(temp1.toString()) && temp.length() > longest.length()){
                longest = temp1;
            }else{
                StringBuilder temp2 = new StringBuilder(temp);
                for(int i = longest.length(); i < temp.length(); i++){
                    temp2.delete(0, 1);
                    StringBuilder temp3 = new StringBuilder(temp2);
                    temp3.reverse();
                    if(temp2.toString().equals(temp3.toString()) && temp2.length() > longest.length()){
                        longest = temp3;
                    }
                }
            }
        }
        return longest.toString();
    }
}