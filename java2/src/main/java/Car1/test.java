package Car1;

public class test {
    String color;//颜色
    int speed;//速度
    int seat;//座位
    //成员方法
    public void run(){

        System.out.println("跑");
    }

    public static void main(String[] args) {
        //int a = 10 写在方法里的变量，局部变量；
        //创建对象
        //这种方法称为引用
        test car=new test();
        car.color="red";
        car.seat=120;
        car.seat=4;
        car.run();
        System.out.println(car.color+","+car.speed+","+car.seat);


    }

}
