class Solution {
    public int reverse(int x) {
        StringBuilder s = new StringBuilder(Integer.toString(x));
        Boolean neg = false;
        long out;
        if(x < 0){
            neg = true;
            s.delete(0, 1);
        } 
        s.reverse();
        if(neg){
            out = - Long.parseLong(s.toString());
        }
        else{
            out = Long.parseLong(s.toString());
        }
        if(out > - Math.pow(2,31) - 1 && out < Math.pow(2,31) ){
            return (int) (long) out;
        }
        else{
            return 0;
        }
    }
}      
