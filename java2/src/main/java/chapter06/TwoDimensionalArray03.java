package chapter06;

public class TwoDimensionalArray03 {
    public static void main(String[] args) {
        int[][] var1 = new int[11][];

        int var2;
        int var3;
        for(var2 = 0; var2 < var1.length; ++var2) {
            var1[var2] = new int[var2 + 1];

            for(var3 = 0; var3 < var1[var2].length; ++var3) {
                var1[var2][var3] = var2 + 1;
            }
        }
        Object[] cat1={"小白",3,"白色"};
        for (Object o : cat1) {
            System.out.print(o);
        }
        System.out.println();
        System.out.println("=====arr元素=====");

        for(var2 = 0; var2 < var1.length; ++var2) {
            for(var3 = 0; var3 < var1[var2].length; ++var3) {
                System.out.print(var1[var2][var3] + " ");

            }

            System.out.println();
        }
    }
}
