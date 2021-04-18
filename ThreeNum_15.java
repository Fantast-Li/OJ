package 数组;

import java.lang.reflect.Array;
import java.util.*;

public class ThreeNum_15 {
    //哈希表求解
    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3){
            return new ArrayList<>();
        }
        // 排序
        Arrays.sort(nums);
        HashMap<Integer,Integer> map = new HashMap<>(); //哈希表允许元素重复
        List<List<Integer>> resultList = new ArrayList<>();
        //将数组放进map
        Integer t;
        int x = 0;
        for (int i = 0; i < nums.length ; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length ; i++) {
            x = -nums[i];
            //去重
            if (i>0 && nums[i] == nums[i-1]) {
                continue;
            }
            for (int j = i+1; j < nums.length ; j++) {
                // 去重
                if (j>i+1 && nums[j] == nums[j-1]) {
                    continue;
                }

                if ((t=map.get(x -nums[j])) !=null) {
                    //符合条件 存入
                    if (t > j) {
                        resultList.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[t])));
                    } else {
                        break;
                    }
                }
            }
        }
        return resultList;
    }
    // 三指针法
    public static List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> resultList =  new ArrayList<List<Integer>>();
        if (nums.length<3){
           return resultList;
        }
        //排序
        Arrays.sort(nums);
        if (nums[0] > 0){
            return resultList;
        }
        for (int i = 0; i < nums.length-1 ; i++) {
            int t = 0 - nums[i];
            //去重
            if (i>0 && nums[i] == nums[i-1]) {
                continue;
            }
            int l = i+1 ;
            int r = nums.length-1;
            while (l<r) {
                if (nums[r]+nums[l] == t) {
                    //符合条件 加入list
                    resultList.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    while (l<r && nums[l]==nums[l+1]) {
                        l++;
                    }
                    while (l<r && nums[r] == nums[r-1]) {
                        r--;
                    }
                    l++;
                    r--;
                } else if (nums[l]+nums[r] > t ) {
                    r--;
                }else {
                    l++;
                }
            }

        }
        return resultList;

    }
    public static void main(String[] args) {
        int[] a = {0,0,0,};
        System.out.println(ThreeNum_15.threeSum(a));
    }
}
