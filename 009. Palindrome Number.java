class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        StringBuilder s = new StringBuilder(Integer.toString(x));
        StringBuilder r = new StringBuilder(Integer.toString(x));
        r.reverse();
        return (r.toString().equals(s.toString()));
    }
}
