package jicheng;

public class Test {
    public static void main(String[] args) {
        HeiXiongGuai hx=new HeiXiongGuai();
        hx.name="黑熊怪";
        System.out.println(hx.name);
        hx.eat();
        hx.tou();
//        hx.px();私有的是不能被继承
    }
}
