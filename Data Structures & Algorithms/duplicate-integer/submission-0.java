class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> uniqueNumSet = new HashSet<>();

        for(int num : nums) {
            if(uniqueNumSet.contains(num)) {
                return true;
            }
            uniqueNumSet.add(num);
        }
        return false;
    }
}