class Solution {
    public int myAtoi(String s) {
        s = s.trim(); //trim leading and trailing whitespaces
        if(s.length() == 0) return 0; //if after trimmin we're left with no chars, return
        char currentChar = s.charAt(0);
        if(Character.isLetter(currentChar) || currentChar == '.') return 0; //if we start with a letter or dot, return
        int sign = currentChar == '-' ? -1 : 1; //set the sign of the number
        
        int index = 0, digit;
        double result = 0; //double so we don't overflow while iterating
        
        if(currentChar == '-' || currentChar == '+') index++; //increment the index if currentCharacter is a sign
        
        if(index < s.length()) currentChar = s.charAt(index); // make sure we're still within our bounds!
        
        while(index < s.length() && Character.isDigit(currentChar) && result > Integer.MIN_VALUE && result < Integer.MAX_VALUE) { //conditions to keep reading from the string
            digit = Character.getNumericValue(currentChar);
            result = (result * 10) + (sign * digit); //simple math :)
            index++;
            
            if(index < s.length()) currentChar = s.charAt(index);
        }
        
        
        if(result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        if(result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        
        return (int)result;
    }
}