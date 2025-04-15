class Solution {
    public boolean isPalindrome(int n)  {
        int temp = n;
        int lastdigit = 0;
        int reversenumber = 0;
        if (n < 0)
            return false;
        while (n > 0) {
            lastdigit = n % 10;
            n = n / 10;
            reversenumber = (reversenumber * 10) + lastdigit;
        }
        if (reversenumber == temp) {
            return true;
        } else
            return false;
    }
}