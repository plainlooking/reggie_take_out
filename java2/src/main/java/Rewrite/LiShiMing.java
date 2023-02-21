package Rewrite;
//子类中的方法必须和父类中的方法一致
public class LiShiMing extends LiYuan {
    public void countries(){
        //半盖方法
        super.countries();//super可以调用父类中被重写的方法
        System.out.println("也想创建一个国家");
    }
    public static void main(String[] args) {
        LiShiMing c=new LiShiMing();
        c.countries();
    }
}
