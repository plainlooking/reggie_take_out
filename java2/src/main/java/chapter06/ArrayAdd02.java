package chapter06;

import java.util.Scanner;

public class ArrayAdd02 {

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        int[] var2 = new int[]{1, 2, 3};

        char var6;
        do {
            int[] var3 = new int[var2.length + 1];

            int var4;
            for (var4 = 0; var4 < var2.length; ++var4) {
                var3[var4] = var2[var4];
            }

            System.out.println("请输入你要添加的元素");
            var4 = var1.nextInt();
            var3[var3.length - 1] = var4;
            var2 = var3;
            System.out.println("====arr扩容后元素情况====");

            for (int var5 = 0; var5 < var2.length; ++var5) {
                System.out.print(var2[var5] + "\t");
            }

            System.out.println("是否继续添加 y/n");
            var6 = var1.next().charAt(0);
        } while (var6 != 'n');

        System.out.println("你退出了添加...");
    }
}
