import java.util.Scanner;

public class LongGe {
    public static void main(String[] args) {

        int a = 1>>2;
        float b = .414f;
        System.out.println(a + "," + b);
        Scanner input = new Scanner(System.in);
        int c1 = input.nextInt();
        int c2 = input.nextInt();
        int c3 = input.nextInt();
        int max1 = c1 > c2 ? c1 : c2;
        int max2 = max1 > c3 ? max1 : c3;
        System.out.println("最大值"+max2);
        System.out.println("位运算"+a);
    }
}
