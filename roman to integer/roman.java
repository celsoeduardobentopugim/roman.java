import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        
        int result = 0;
        int prevValue = 0;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            int value = romanMap.get(s.charAt(i));
            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }
            prevValue = value;
        }
        
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        String s1 = "III";
        System.out.println("Output for s1: " + solution.romanToInt(s1)); // Output: 3
        
        String s2 = "LVIII";
        System.out.println("Output for s2: " + solution.romanToInt(s2)); // Output: 58
        
        String s3 = "MCMXCIV";
        System.out.println("Output for s3: " + solution.romanToInt(s3)); // Output: 1994
    }
}