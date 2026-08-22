class Solution {
    public double myPow(double x, int n) {
        long exponent = n;  // Use long to handle Integer.MIN_VALUE
        if (exponent < 0) {
            x = 1 / x;
            exponent = -exponent;
        }
        double result = 1.0;
        while (exponent > 0) {
            if (exponent % 2 == 1) { // for odd
                result *= x;
            }
            x *= x;
            exponent /= 2;
        }
        return result;
    }
}