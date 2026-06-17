class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        //sort array
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int target = -1 * nums[i];
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int currSum = nums[j] + nums[k] ;
                if (currSum == target) {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++; k--;
                } else if (currSum > target) {
                    k--;
                } else {
                    j++;
                }
            }
            
        }
        return new ArrayList<>(res);
    }
}
