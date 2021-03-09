package 剑指offer;
//
//解题思路
//1.遍历二维数组
// 2.看这个数是否含有那个数.

public class CheckArray_03 {
    public boolean Find (int target,int[][] array) {
        for (int[] arrays: array) {
            for (int a:arrays) {
                if (a == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
         int a = 7 ;
         CheckArray_03 checkArray_03 = new CheckArray_03();
        System.out.println(checkArray_03.Find(a, array));

    }
}
