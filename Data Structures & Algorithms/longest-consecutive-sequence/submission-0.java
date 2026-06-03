class Solution {
    public int longestConsecutive(int[] nums) {
        int res = 0;
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());        
        //check begining of sequence
        for (int num : nums) {
            int seq = 0;
            int curr = num;
            while (set.contains(curr)) {
                seq++;
                curr++;
            }
            res = Math.max(res, seq);
        }

        return res;
    }
}
