class Solution {
    public boolean isHappy(int n) {
        ArrayList path = new ArrayList();
        while(!path.contains(n)){
            if(n == 1){
                return true;
            }
            path.add(n);
            int s = 0;
            while(n > 0){
                s += (n % 10) * (n % 10);
                n /= 10;
            }
            n = s;
        }
        return false;
    }
}
