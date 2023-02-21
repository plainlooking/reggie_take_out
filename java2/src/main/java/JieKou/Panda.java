package JieKou;

//类可以继承一个类，实现多个接口
public class Panda extends Animal implements Protectable, Test {
    @Override
    public void eat() {
        System.out.println("熊猫吃竹子");
    }

    public void cang() {
        System.out.println("藏山里");
    }

    public void getMoney() {
        System.out.println("值钱的");
    }
}
