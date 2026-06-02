class Solution {
    public int myAtoi(String s) {
        
        int n = s.length();
        int i = 0;
        int sign = 1;
        long num = 0;

        // Skip leading spaces
        while (i < n && s.charAt(i) == ' ')
            i++;

        // Handle sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-')
                sign = -1;
            i++;
        }

        // Process digits
        while (i < n && Character.isDigit(s.charAt(i))) {

            int digit = s.charAt(i) - '0';
            num = num * 10 + digit;

            // Clamp if out of range
            if (sign * num > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;

            if (sign * num < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;

            i++;
        }

        return (int)(sign*num);
        
    }
}