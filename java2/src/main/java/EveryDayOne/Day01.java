//package EveryDayOne;
//
//import org.junit.Test;
//
//import java.util.Arrays;
//
///**
// * 1,两数之和
//*/
//public class Day01 {
//    @Test
//    public void  test(){
//        int[] nums={3,2,4};
//        int target=6;
//       System.out.println(Arrays.toString(tst(nums, target)));
//    }
//    public int[] tst(int[] nums, int target) {
//        for (int i=0;i<nums.length;i++){
//            for (int j=0;j<nums.length;j++){
//                if (i != j && nums[i]+nums[j]==target){
//                    return new int[] {i,j};
//                }
//            }
//        }
//        return null;
//    }
//}
