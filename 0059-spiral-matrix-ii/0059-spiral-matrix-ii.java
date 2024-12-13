class Solution {
    public int[][] generateMatrix(int n) {
            int arr[][] = new int[n][n];
        int value = 0;
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        int dir = 0;
        while (top <= bottom && left <= right) {
            if (dir == 0) {
                for (int i = left; i <= right; i++) {
                    arr[top][i] = ++value;
                }
                top++;
            } else if (dir == 1) {
                for (int i = top; i <= bottom; i++) {
                    arr[i][right] = ++value;
                }
                right--;
            } else if (dir == 2) {
                for (int i = right; i >= left; i--) {
                    arr[bottom][i] = ++value;
                }
                bottom--;
            } else if (dir == 3) {
                for (int i = bottom; i >= top; i--) {
                    arr[i][left] = ++value;
                }
                left++;
            }
            dir = (dir + 1) % 4;
        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                System.out.println(arr[i][j]);
//            }
//        }
        return arr;
    }
}