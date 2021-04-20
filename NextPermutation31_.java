package 数组;

import java.lang.reflect.Array;
import java.util.Arrays;

//实现获取 下一个排列 的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
//
//如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
//
//必须 原地 修改，只允许使用额外常数空间
//
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/next-permutation
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
public class NextPermutation31_ {
    public static void nextPermutation(int[] nums) {
        int n = nums.length ;
        //从后往前找找第一个第一个升序的  k 是要找的位置  k 之后为降序
        int k = n- 1 ;
        while (k-1>=0 && nums[k]<= nums[k-1]) {
            k--;
        }
        if (k==0) {
            //为 321  这种  逆转
            reverse(nums,0,n-1);
        } else {
                int u = k ;
            while (u < n-1 && nums[u+1] > nums[k-1]) {
                u++;
            }
                swap(nums,k-1,u);
                reverse(nums,k,n-1);
            }
    }

        private static void swap(int[] nums, int i, int u) {
            int temp = nums[i];
            nums[i] = nums[u];
            nums[u] = temp;
        }

        private static void reverse(int[] nums, int i, int j) {
            int l = i ;
            int r = j;
            while(l<r) {
                swap(nums,l++,r--);
            }
        }

        public static void main(String[] args) {
        int[] nums = {1,3,5,4,1};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
