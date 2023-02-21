package JieKou;
//接口只能用接口继承
//接口与类只能是实现关系 implements
public interface Test {      //接口使用interface来声明，已经不是类了
    //接口中的所有方法都是抽象方法，可以省略掉abstract
    //接口中所有的内容都是公开的，公共的
    public abstract void getMoney();//接口中所有的方法都是抽象方法，不可以有正常方法

}
