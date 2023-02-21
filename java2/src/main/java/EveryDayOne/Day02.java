//package EveryDayOne;
//
//import org.junit.Test;
//
///**
// * 整数反转
// */
//
//public class Day02 {
//    @Test
//    public void test(){
//        int x=-123;
//        System.out.println(reverse(x));
//    }
//    public int reverse(int x) {
//        int res = 0;
//        while (x != 0) {
//            int tmp = res * 10 + x % 10;
//            if (tmp / 10 != res) { // 溢出!!!
//                return 0;
//            }
//            res = tmp;
//            x /= 10;
//        }
//        return res;
//    }
//}
