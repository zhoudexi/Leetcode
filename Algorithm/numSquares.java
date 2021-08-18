import java.io.IOException;

class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        for(int i = 1;i <= n;i++){
            dp[i] = i;
            for(int j = 1;j * j <= i;j++)
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
        }
        return dp[n];
    }
}

public class numSquares {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            
            int ret = new Solution().numSquares(n);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
