class Solution {
    public String reverseWords(String s) {
      char[] ch = s.toCharArray();
        int n = ch.length;
        int start = 0;
        
        for (int end = 0; end < n; end++) {
            if (ch[end] == ' ') {
                reverse(ch, start, end - 1);
                start = end + 1;
            }
        }
        reverse(ch, start, n - 1);  
        return new String(ch);
    }
    private void reverse(char[] ch, int left, int right) {
        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
    }
}