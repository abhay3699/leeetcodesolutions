class Solution {
    public boolean isPalindrome(int x) {
        String xString = Integer.toString(x);
        int lengthString = xString.length();
        for (int i = 0; i<lengthString/2; i++){
            if (xString.charAt(i) != xString.charAt(lengthString-i-1)) return false;  
        }
        return true;
    }
}