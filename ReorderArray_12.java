package 剑指offer;
//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
// 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。

import java.util.Arrays;

//思路
public class ReorderArray_12 {
    public static void reOrderArray(int [] array) {
        //相对位置不变，稳定性
        //插入排序的思想
        // .定义一个k值 标记已经摆好奇数的数量
        int k = 0 ;
        // 将数组的所有元素遍历 如果是奇数的话就将技术插入到前排 .
        // 如果是偶数就什么也不发生.
        for (int i = 0; i < array.length ; i++) {
            if (array[i]%2!=0){
                //因为要保持稳定性，所以要一个一进行j交换 将他交换到k 的位置 然后k++
                int j = i ;
                while (j>k) {
                    int temp = array[j];
                    array[j]=array[j-1];
                    array[j-1] = temp;
                    j--;
                }
                k++;
            }
        }

    }
    public static void main(String[] args) {
        int[] array = {1,4,5,2,4,3,4,9};
        ReorderArray_12.reOrderArray(array);
        System.out.println(Arrays.toString(array));
    }
}
