class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        return Arrays.stream(matrix)
            .flatMapToInt(Arrays::stream)
            .anyMatch(num -> num == target);

    }
}
