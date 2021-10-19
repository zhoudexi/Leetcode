// @algorithm @lc id=100323 lang=java 
// @title ba-shu-zu-pai-cheng-zui-xiao-de-shu-lcof


package ____Offer_45___________LCOF;
public class Solution {
    public String minNumber(int[] nums) {
        String[] str = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            str[i] = String.valueOf(nums[i]);
        }
        quickSort(str, 0, str.length - 1);
        StringBuilder res = new StringBuilder();
        for (String string : str) {
            res.append(string);
        }
        return res.toString();
    }

    private void quickSort(String[] str, int l, int r) {
        if(l >= r) return;
        int i = l, j = r;
        String tmp = str[i];
        while(i < j){
            while((str[j] + str[l]).compareTo(str[l] + str[j]) >= 0 && i < j) j--;
            while((str[i] + str[l]).compareTo(str[l] + str[i]) <= 0 && i < j) i++;
            tmp = str[i];
            str[i] = str[j];
            str[j] = tmp;
        }  
        str[i] = str[l];
        str[l] = tmp;
        quickSort(str, l, i - 1);
        quickSort(str, i + 1, r);
    }
}