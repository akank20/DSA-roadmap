class Solution {
    public int largestRectangleArea(int[] heights) {
           return calcArea(heights, 0, heights.length - 1); 
    }
    //Divide and Conquer
    public int calcArea(int[] heights, int start, int end) {
        if (start > end) return 0;
        int minIndex = start;

        for (int i = start; i <= end; i++) {
            if (heights[minIndex] > heights[i]) {
                minIndex = i;
            }
        }
        int currArea = heights[minIndex] * (end - start + 1);
        return Math.max(currArea, Math.max(calcArea(heights, start, minIndex - 1), calcArea(heights, minIndex + 1, end)));
    }
}
