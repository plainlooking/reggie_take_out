package AccessPermissions;

public class test_1 {
    public static void main(String[] args) {
        test p = new test();
        System.out.println(p.pul);
      //  System.out.println(p.pri); 私有变量不能调用使用
        System.out.println(p.def);
    }
}
