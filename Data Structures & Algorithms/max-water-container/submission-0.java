class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int left = 0, right = heights.length - 1;

        while (left < right) {
            int currArea = (right - left) * Math.min(heights[right],heights[left]);
            //System.out.println(heights[left] + "  " + heights[right] + "  " + currArea);
            maxArea = Math.max(maxArea, currArea);

            if (heights[left] <= heights[right]) {
                left++;
            } else right--;
        }
        return maxArea;
    }
}
