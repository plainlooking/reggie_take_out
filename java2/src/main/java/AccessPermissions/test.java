package AccessPermissions;

public class test {
    public String pul="public";//公有的
    private String pri="private";//私有的
    String def="default";//包内的

    public static void main(String[] args) {
        test p=new test();
        System.out.println(p.pul);
        System.out.println(p.pri);
        System.out.println(p.def);
    }
}
