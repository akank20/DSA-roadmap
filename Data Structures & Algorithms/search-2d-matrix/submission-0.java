class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int r = 0; r < matrix.length; r++) {
            //check whether the limit lies between this row, then search the col
            //otherwise skip to next
            if (target >= matrix[r][0] && target <= matrix[r][matrix[0].length - 1]) {
                System.out.println(matrix[r][0] + "  " + matrix[r][matrix[0].length - 1]);
                return binarySearch(matrix, target, r);
            }
        }
        return false;
    }

    public boolean binarySearch(int[][] matrix, int target, int row) {
        int left = 0, right = matrix[0].length - 1;
        while(left <= right) {
            int mid = left + (right - left)/2;
            if(matrix[row][mid] == target) {
                return true;
            }
            if(matrix[row][mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
