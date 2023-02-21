//package liko;
//
//import com.sun.org.apache.bcel.internal.generic.ARETURN;
//import org.junit.Test;
//
//public class laingshuhe {
//    public static void main(String[] args) {
//        int x=121;
//        if (x<0){
//             System.out.println("ture");
//        }
//
//        int a=x%10;
//        int c=a*100;
//        int d=(x-a)%100;
//        int e=(x-a-d)/100;
//        int f=c+d+e;
//        f /=10;
//        System.out.println(a+","+c+","+d+","+e+","+f);
//        if (x==f & f>0){
//            System.out.println("true");
//        }
//        else {
//            System.out.println("flas");
//        }
//    }
//}
////    //   public int[] twosum(int[] nums,int targe){
//////       for (int i = 0;i<nums.length;i++)
//////           for (int j=i+1;j<nums.length;j++)
//////               if (nums[i]+nums[j] == targe)
//////                   int[] num={i,j};
//////               return num;
//////   }
//////}
//
//    public int[] two(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int k = 0; k < nums.length; k++) {
//                if (((nums[i] + nums[k]) == target) && (i != k)) {
//                    int[] num = {k, i};
//                    return num;
//                }
//            }
//        }
//        return nums;//摆烂
//    }
//}
//
