package liko;

public class liangshuxiangjia {
    //两数之和
    public static void main(String[] args) {
        int x=121;
        if (x<0){
             System.out.println("ture");
        }

        int a=x%10;
        int c=a*100;
        int d=(x-a)%100;
        int e=(x-a-d)/100;
        int f=c+d+e;
        f /=10;
        System.out.println(a+","+c+","+d+","+e+","+f);
        if (x==f & f>0){
            System.out.println("true");
        }
        else {
            System.out.println("flas");
        }
    }
}
