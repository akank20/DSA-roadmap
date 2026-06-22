class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //Optimized search - O(log(m*n))
        int rl = matrix.length;
        if (rl == 0) return false;
        int cl = matrix[0].length;

        //apply binary serach on virtually sorted array
        int start = 0, end = rl * cl - 1;
        int mid, midElem;

        while (start <= end) {
            mid = (start + end) / 2;
            midElem = matrix[mid/cl][mid%cl];
            if (target == midElem){
                return true;
            } else {
                if (target < midElem) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return false;
    }
}
