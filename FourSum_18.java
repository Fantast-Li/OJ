package 数组;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，使得 a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。
//
//注意：答案中不可以包含重复的四元组。
//
// 
//
//示例 1：
//
//输入：nums = [1,0,-1,0,-2,2], target = 0
//输出：[[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
//示例 2：
//
//输入：nums = [], target = 0
//输出：[]
//
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/4sum
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
public class FourSum_18 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> resultList = new ArrayList<>();
        if (nums.length<4) {
            return resultList;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-3 ; i++) {
            //去重
            if (i>0 && nums[i] == nums[i-1]) {
                continue;
            }
            for (int j = i+1; j < nums.length-2; j++) {
                //去重
                if (j>i+1 && nums[j] == nums[j-1]) {
                    continue;
                }
                int l = j+1;
                int r = nums.length-1 ;
                while (l<r) {
                    int sum = nums[i]+nums[j]+nums[l]+nums[r];
                    if (sum > target){
                        r--;
                    } else if (sum < target) {
                        l++;
                    } else {
                        resultList.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
                        while (l<r && nums[l] == nums[l+1]) {
                            l++;
                        }
                        while (l<r && nums[r] == nums[r-1]) {
                            r--;
                        }
                        r--;
                        l++;
                    }

                }

            }
        }
        return resultList;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,2,2,2};
        System.out.println(fourSum(nums, 8));
    }
}
