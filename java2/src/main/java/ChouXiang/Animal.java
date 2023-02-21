package ChouXiang;
//类中如果有抽象方法，那么这个类必须是抽象类
public abstract class Animal {
    public abstract void eat();
//abstract修饰方法，这个方法就是一个抽象方法，抽象方法没有方法体，直接;结束
    public abstract void dong();
    //抽象类里可以有正常的抽象方法
    public void shell(){
            System.out.println("哈哈哈");
    }
}
