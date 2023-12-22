class Solution {
    public String intToRoman(int num) {
        int[] numeric = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while (num > 0) {
            if (num >= numeric[i]) {
                ans.append(roman[i]);
                num -= numeric[i];
            } else {
                i++;
            }
        }

        return ans.toString();
    }
}
