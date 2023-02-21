package static_1;

public class test_1 {
    {
        System.out.println("通用构造");
    }
    static {
        System.out.println("静态构造");//静态>通用>构造方法->创建对象
    }
    public test_1(){
        System.out.println("构造方法");
    }
    public static void main(String[] args) {
        new test_1();
    }
}
