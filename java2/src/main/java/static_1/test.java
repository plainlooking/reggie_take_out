package static_1;

public class test {
    String name;
    static String niandai;//静态变量，共享
    int age;
    public test(String name,String niandai,int age){
        this.name=name;
        this.niandai=niandai;
        this.age=age;
    }

    public static void main(String[] args) {
        test p1=new test("余黑皮","明朝",18);
        test p2=new test("余一帆麻瓜","清朝",20);
        test.niandai="唐朝";//全局修改该变量的参数
        System.out.println(p1.name+","+p1.niandai+","+p1.age);
        System.out.println(p2.name+","+p2.niandai+","+p2.age);
    }
}
