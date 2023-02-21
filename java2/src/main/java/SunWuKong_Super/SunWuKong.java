package SunWuKong_Super;

public class SunWuKong extends Hero{
    String name="孙大圣";
    public SunWuKong(){
        super("余斌狗儿");
        System.out.println(super.name);
        System.out.println("我是子类构造方法");
    }
    public void chi(){
        //先找自己类，再找父类
        System.out.println(this.name +"在吃桃子");
        //想看到父类的name
        System.out.println(super.name+"在吃屁");

    }

    public static void main(String[] args) {
        SunWuKong c=new SunWuKong();
        c.chi();
    }
}
