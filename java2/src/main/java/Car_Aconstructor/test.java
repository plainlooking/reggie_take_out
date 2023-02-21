package Car_Aconstructor;

public class test {
    String color;//颜色
    int speed;//速度
    int seat;//座位

    //java会自动给每一个类赠送一个无参数的构造方法
    //创建对象的时候，自动调用方法
    //如果你自己定义了构造方法，java就不在赠送
    public test(String color,int speed,int seat) {
        this.color=color;
        this.speed=speed;
        this.seat=seat;
        System.out.println("我是构造方法");
    }

    //成员方法
    public void run() {

        System.out.println(this.color+"跑");
    }

    public static void main(String[] args) {
        test car = new test("red",120,5);//默认调用的是构造方法
////        //int a = 10 写在方法里的变量，局部变量；
////        //创建对象
////        //这种方法称为引
// //        car.color="red";
////        car.seat=120;
////        car.seat=4
        car.run();
        test car1 = new test("green",80,4);
        car1.run();

//        car.run();
////        System.out.println(car.color+","+car.speed+","+car.seat);


    }
}
