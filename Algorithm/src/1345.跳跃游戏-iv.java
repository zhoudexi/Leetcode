/*
 * @lc app=leetcode.cn id=1345 lang=java
 *
 * [1345] 跳跃游戏 IV
 */

// @lc code=start
class Solution {
    public int minJumps(int[] arr) {

    }class Solution {
        public int minJumps(int[] arr) {
            Map<Integer, List<Integer>> idxSameValue = new HashMap<Integer, List<Integer>>();
            for (int i = 0; i < arr.length; i++) {
                idxSameValue.putIfAbsent(arr[i], new ArrayList<Integer>());
                idxSameValue.get(arr[i]).add(i);
            }
            Set<Integer> visitedIndex = new HashSet<Integer>();
            Queue<int[]> queue = new ArrayDeque<int[]>();
            queue.offer(new int[]{0, 0});
            visitedIndex.add(0);
            while (!queue.isEmpty()) {
                int[] idxStep = queue.poll();
                int idx = idxStep[0], step = idxStep[1];
                if (idx == arr.length - 1) {
                    return step;
                }
                int v = arr[idx];
                step++;
                if (idxSameValue.containsKey(v)) {
                    for (int i : idxSameValue.get(v)) {
                        if (visitedIndex.add(i)) {
                            queue.offer(new int[]{i, step});
                        }
                    }
                    idxSameValue.remove(v);
                }
                if (idx + 1 < arr.length && visitedIndex.add(idx + 1)) {
                    queue.offer(new int[]{idx + 1, step});
                }
                if (idx - 1 >= 0 && visitedIndex.add(idx - 1)) {
                    queue.offer(new int[]{idx - 1, step});
                }
            }
            return -1;
        }
    }

