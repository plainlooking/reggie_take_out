package GetdAndSet;

public class test {
    //成员变量私有
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age){
        if (age < 18)
            this.age=0;
        else
            this.age=age;
    }

    //    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int name) {
//        if (age < 18)
//            this.age = 0;
//        else
//            this.age=age;
//    }
//
//    public String getName() {
//        return this.name;
//    }
//
//    public int getAge(int i) {
//        return this.age;
//    }

    public void chi() {
        System.out.println(this.name + "在吃东西");
    }

}
