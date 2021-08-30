class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permute = new ArrayList<>();
        List<Integer> permuteList = new ArrayList<>();
        boolean[] hasvisited = new boolean[nums.length];
        backtracking(permute, permuteList, hasvisited, nums);
        return permute;
    }

    private void backtracking(List<List<Integer>> permute, List<Integer> permuteList, boolean[] hasvisited, int[] nums) {
        if(permuteList.size() == nums.length){
            permute.add(new ArrayList<>(permuteList));
            return;
        }
        for(int i = 0; i < hasvisited.length; i++){
            if(hasvisited[i])
                continue;
            hasvisited[i] = true;
            permuteList.add(nums[i]);
            backtracking(permute, permuteList, hasvisited, nums);
            permuteList.remove(permuteList.size() - 1);
            hasvisited[i] = false;
        }
    }
}