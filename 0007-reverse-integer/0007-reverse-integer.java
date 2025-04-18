class Solution {
    public int reverse(int n) {
  int lastdigit = 0;
        int answer = 0;
        boolean negative = false;
        if (n == 0) { // for handling 0
            return 0;
        }
        if (n < 0) {
            negative = true;
            n = Math.abs(n);
        }

        while (n != 0) {
            lastdigit = n % 10;
            if (answer > Integer.MAX_VALUE / 10 || (answer == Integer.MAX_VALUE / 10 && lastdigit> 7)) {
                return 0;
            }
            if (answer < Integer.MIN_VALUE / 10 || (answer == Integer.MIN_VALUE / 10 && lastdigit < -8)) {
                return 0;
            }
            answer = (answer * 10) + lastdigit;
            n = n / 10;
        }
        return negative ? -answer : answer;
}
}