package ChouXiang;

public class Cat extends Animal{
    //抽象子类必须重写父类方法，否则子类也必须是抽象的
    public void eat(){
        System.out.println("猫吃鱼");
    }
    public void dong(){
        System.out.println("猫喜欢动");
    }
}
