package 排序;

import java.util.Arrays;

// 冒泡排序
public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {2,3,4,5,6};
        System.out.println(Arrays.toString(BubbleSort.bubbleSort(a)));

    }
    public static int[] bubbleSort(int[] array) {
        //只需要array.length-1次array冒泡过程即可
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1 ; j++) {
                if (array[j] < array[j+1]) {
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
                }
            }
        }
        return array;
    }
}
