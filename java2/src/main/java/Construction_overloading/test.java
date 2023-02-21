package Construction_overloading;
//构造方法重载
//创建大侠代码
public class test {
    String name;
    String waihao;
    int age;
    String banpai;
    //需要连个构造方法
    public test(String name,String waihao,int age,String banpai){
        this(name, age, banpai);//this还可以调用当前类中其他的构造方法
//        this.name=name;
//        this.waihao=waihao;
//        this.age=age;
        this.banpai=banpai;
    }
   //构造方法也是方法，也可以重载
    //可以让我们有更多方式去创建对象
    public test(String name,int age,String banpai){
        this.name=name;
        this.age=age;
        this.banpai=banpai;
    }

    public static void main(String[] args) {
        //创建岳不群，给它参数
        test daxia=new test("岳不群","君子剑",48,"华山派");
        test daxia1=new test("武松",18,"梁山");

    }
}
