package Polymorphism;

public class chi {
    public static void main(String[] args) {
        Animal ain1=new Cat();
        Animal ain2=new Dog();
        Person c=new Person();
        c.feed(ain1);
        c.feed(ain2);
        //多态：把不同的数据类型进行统一
        //向下转型
        Cat cc=(Cat) ain1;
        cc.zhua();
    }
}
