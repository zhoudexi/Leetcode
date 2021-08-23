import java.util.ArrayList;
import java.util.List;

class Solution {
    private static final String[] KEYS = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<String>();
        if(digits.length() == 0 || digits == null)
            return combinations;
        doCombination(new StringBuilder(),combinations,digits);
        return combinations;
    }
    private void doCombination(StringBuilder stringBuilder, List<String> combinations, final String digits) {
        if(stringBuilder.length() == digits.length()){
            combinations.add(stringBuilder.toString());
            return;
        }
        int curDigits = digits.charAt(stringBuilder.length()) - '0';
        String letters = KEYS[curDigits];
        for(char c : letters.toCharArray()){
            stringBuilder.append(c);
            doCombination(stringBuilder, combinations, digits);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }
}
