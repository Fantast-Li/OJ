package 数组;
//59. 螺旋矩阵 II
//给你一个正整数 n ，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix
class GenerateMatrix_59{
    public int[][] generateMatrix(int n) {
        //模拟法,边界法
        int num = 1;
        int [][] matrix = new int[n][n];
        //定义边界
        int left = 1 , rigth = n - 1 , top = 1 , bottom = n - 1;
        while (left<= rigth && top <=bottom) {
            for (int i = left; i <= rigth ; i++) {

            }
        }
    }
}
