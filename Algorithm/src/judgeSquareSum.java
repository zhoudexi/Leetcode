class Solution {
    public boolean judgeSquareSum(int c) {
        int l = 0,r = (int)Math.sqrt(c);
        if(c<0) return false;
        while(l <= r){
            int sum = l * l + r * r;
            if(sum > c) r--;
            else if(sum < c) l++;
            else return true;
        }
        return false;
    }
}