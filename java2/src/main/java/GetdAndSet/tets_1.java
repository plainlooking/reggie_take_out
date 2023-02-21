package GetdAndSet;

public class tets_1 {
    public static void main(String[] args) {
       test p=new test();
        p.setName("余斌狗儿");
        p.setAge(20);
/*
        p.name = "余斌狗儿";
        p.age = -1;
*/
        System.out.println(p.getName());
        System.out.println(p.getAge());
        //System.out.println(p.getAge());
        p.chi();
    }
}
