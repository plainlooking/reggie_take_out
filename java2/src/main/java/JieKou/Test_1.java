package JieKou;

public class Test_1 {
    public static void main(String[] args) {
//        Test c=new Gold();//接口一样具有多态性
//        c.getMoney();
        Panda p=new Panda();
        Animal a=new Panda();//向上转型，只能输出Panda具有Ainmal，eat的方法
        Test t=new Panda();//向上转型 只能输出Panda具有Test，getMoney的方法
        Protectable p1=new Panda();//向上转型 只能输出Panda具有Protectable，cang的方法
        p.eat();
        p.cang();
        p.getMoney();
    }
}
