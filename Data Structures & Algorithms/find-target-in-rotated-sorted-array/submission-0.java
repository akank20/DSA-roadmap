class Solution {
    public int search(int[] nums, int target) {
        //find pivot 
        //pivot would be at left index after loop completed
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[nums.length - 1]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        //binary search on pivot's left
        int res = binarySearch(nums, target, 0, left - 1);
        if (res != -1)
            return res;
         //binary search on pivot's right
         return binarySearch(nums, target, left, nums.length - 1);
    }

    public int binarySearch (int[] nums, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (target == nums[mid]) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return - 1;
    }
}
