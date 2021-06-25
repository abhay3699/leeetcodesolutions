class Solution {
    public String convert(String s, int r) {
        if (r <= 1) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2 * (r - 1)) {
            sb.append(s.charAt(i));
        }
        if (s.length() <= 1) return sb.toString();
        if (r > 2) {
            for (int i = 1; i < r - 1; i++) {
                boolean flag = true;
                int num1 = 2 * (r - 1 - i);
                int num2 = 2 * i;
                int start = i;
                while (start < s.length()) {
                    if (flag) {
                        sb.append(s.charAt(start));
                        start += num1;
                        flag = false;
                    } else {
                        sb.append(s.charAt(start));
                        start += num2;
                        flag = true;
                    }
                }
            }
        }
        for (int i = r - 1; i < s.length(); i += 2 * (r - 1)) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}