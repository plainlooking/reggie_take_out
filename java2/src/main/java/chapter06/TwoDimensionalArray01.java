package chapter06;

public class TwoDimensionalArray01 {

    public static void main(String[] args) {
        int[][] arr = new int[][]{ {0, 0, 0, 0, 0, 0},
                                    {0, 0, 1, 0, 0, 0},
                                    {0, 2, 0, 3, 0, 0},
                                    {0, 0, 0, 0, 0, 0} };
        System.out.println("二维数组的元素个数=" + arr.length);
        System.out.println("第3个一维数组的第4个值=" + arr[2][3]);

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}
