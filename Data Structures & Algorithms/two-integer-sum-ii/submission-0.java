class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;

        if (numbers.length < 2 ) {
            return new int[]{-1, -1};
        }

        while (i < j) {
            int currSum = numbers[i] + numbers[j] ;
            if (currSum == target) {
                return new int[]{i+1, j+1};
            } else if (currSum > target) {
                j--;
            } else {
                i++;
            }
        }
        return new int[] {-1 , -1};
    }
}
