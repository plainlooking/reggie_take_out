package chapter06;

public class BubbleSort {
    public static void main(String[] var0) {
        int[] var1 = new int[]{24, 69, 80, 57, 13, -1, 30, 200, -110};
        boolean var2 = false;

        for (int var3 = 0; var3 < var1.length - 1; ++var3) {
            int var4;
            for (var4 = 0; var4 < var1.length - 1 - var3; ++var4) {
                if (var1[var4] > var1[var4 + 1]) {
                    int var5 = var1[var4];
                    var1[var4] = var1[var4 + 1];
                    var1[var4 + 1] = var5;
                }
            }

            System.out.println("\n==第" + (var3 + 1) + "轮==");

            for (var4 = 0; var4 < var1.length; ++var4) {
                System.out.print(var1[var4] + "\t");
            }
        }
    }
}
