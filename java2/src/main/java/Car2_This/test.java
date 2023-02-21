package Car2_This;

public class test {
    String color;//颜色
    int speed;//速度
    int seat;//座位

    //成员方法
    public void run() {
        //默认会有一个this；当前正在执行这个方法的对象
        //获取颜色，速度
        System.out.println(this);//this等同于car
        System.out.println(this.color);
        System.out.println(this.speed);
        System.out.println("车能跑");
    }

    public void fly(String color) {
        System.out.println(color+"车会飞，飞在"+this.color+"云彩里");//此时访问的也是成员变量
        //变量的查找顺序：先找自己方法内，如果没有，就去this里面找
    }

    public static void main(String[] args) {
  /*      //int a = 10 写在方法里的变量，局部变量；
        //创建对象
        //这种方法称为引用
        test car=new test();
        car.color="red";
        car.seat=120;
        car.seat=4;
        car.run();//在调用方法的时候，java会自动的把对象传递给方法，在方法中由this来接收
        System.out.println(car);//car等同于this
      // System.out.println(car.color+","+car.speed+","+car.seat);
        test car1=new test();
        car1.color="green";
        car1.speed=80;
        car1.seat=5;
        car1.run();
        //this可以帮我们区分成员变量和局部变量*/
        test car = new test();
        car.color="green";
        car.fly("black");
    }
}
