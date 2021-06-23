package 数组;

import java.lang.reflect.Array;
import java.util.Arrays;

//给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
//
// 
//
//示例 1：
//
//输入：nums1 = [1,3], nums2 = [2]
//输出：2.00000
//解释：合并数组 = [1,2,3] ，中位数 2
//示例 2：
//
//输入：nums1 = [1,2], nums2 = [3,4]
//输出：2.50000
//解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
//示例 3：
//
//输入：nums1 = [0,0], nums2 = [0,0]
//输出：0.00000
//示例 4：
//
//输入：nums1 = [], nums2 = [1]
//输出：1.00000
//示例 5：
//
//输入：nums1 = [2], nums2 = []
//输出：2.00000
//
//链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
public class FindMedianSortedArrays_04 {
    public static double findMedianSortedArrays(int[] nums1 ,int[] nums2) {
        double result ;
        int[] a = new int[nums1.length+nums2.length] ;
        int b = 0 ;
        for (int item : nums1) {
            a[b] = item;
            b++;
        }
        for (int value : nums2) {
            a[b] = value;
            b++;
        }
        Arrays.sort(a);
        int temp = a.length/2;
        if (a.length%2 == 0) {
            result = (double) (a[temp]+a[temp-1])/2;
        } else {
            result = a[temp];
        }
        return result;
    }


        public static void main(String[] args) {
        int[] a ={1,3};
        int[] b = {2};
        System.out.println(FindMedianSortedArrays_04.findMedianSortedArrays(a, b));
    }
}
