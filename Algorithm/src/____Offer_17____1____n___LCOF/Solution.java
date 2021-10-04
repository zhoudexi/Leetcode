// @algorithm @lc id=100296 lang=java 
// @title da-yin-cong-1dao-zui-da-de-nwei-shu-lcof


package ____Offer_17____1____n___LCOF;
public class Solution {
    int[] res;
    int nine = 0, count = 0, start, n;
    char[] num, loop = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    public int[] printNumbers(int n) {
        this.n = n;
        res = new int[(int)Math.pow(10, n) - 1];
        num = new char[n];
        start = n - 1;
        dfs(0);
		return res;
    }
    private void dfs(int i) {
        if(i == n){
            String s = String.valueOf(num).substring(start);
            if(!s.equals("0")) res[count++] = Integer.parseInt(s);
            if(n - start == nine) start--;
            return;
        }
        for (char c : loop) {
            if(c == '9') nine++;
            num[i] = c;
            dfs(i + 1);
        }
        nine--;
    }
}