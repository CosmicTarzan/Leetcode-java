class Solution {
    public int mySqrt(int x) {
        long i = 0L;
        while(i * i <= x){
            i += 1;
        }
        return (int) i - 1;
    }
}
