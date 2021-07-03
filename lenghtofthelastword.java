class Solution {
    public int lengthOfLastWord(String s) {
        String[] st = s.split(" ");
        return st.length>0 ? st[st.length-1].length() : 0;
    }
}