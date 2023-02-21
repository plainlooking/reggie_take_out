//package EveryDayOne;
//
//import org.junit.Test;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
///**
// * 给你一个二维整数数组 nums ，其中 nums[i] 是由 不同 正整数组成的一个非空数组，按 升序排列 返回一个数组，
// * 数组中的每个元素在 nums 所有数组 中都出现过。
// * 示例 1：
// *
// * 输入：nums = [[3,1,2,4,5],[1,2,3,4],[3,4,5,6]]
// * 输出：[3,4]
// * 解释：
// * nums[0] = [3,1,2,4,5]，nums[1] = [1,2,3,4]，nums[2] = [3,4,5,6]，在 nums 中每个数组中都出现的数字是 3 和 4 ，所以返回 [3,4] 。
// * 示例 2：
// *
// * 输入：nums = [[1,2,3],[4,5,6]]
// * 输出：[]
// * 解释：
// * 不存在同时出现在 nums[0] 和 nums[1] 的整数，所以返回一个空列表 [] 。
// *
// */
//
////public class liko2248 {
////    @Test
////    public void test() {
//////        int[][] nums = {{3, 2, 1, 4, 5}, {1, 2, 3, 4}, {3, 4, 5, 6}};
////        int[][] nums={{1,2,3},{4,5,6}};
////        int[] a = {};
////        System.out.println(Arrays.toString(a));
////
////    }
////
////    public List<Integer> intersection(int[][] nums) {
////        List<Integer> result = new ArrayList<>();
////        int[] map = new int[1001];
////
////        for (int i = 0; i < nums.length; i++) {
////            for (int j = 0; j < nums[i].length; j++) {
////                map[nums[i][j]] += 1;
////            }
////        }
////
////        for (int i = 0; i < map.length; i++) {
////            if (map[i] == nums.length) {
////                result.add(i);
////            }
////
////        }
////        return result;
////    }
////}
//
