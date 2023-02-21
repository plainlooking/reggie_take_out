package chapter06;

public class test {
    public static void main(String[] args) {

        int ce = chenjie(5);
        System.out.println(ce);
        int he = dengcahshulie(10);
        System.out.println(he);
    }
     static int chenjie(int num){
        if (num <= 1){
            return 1;
        }else{
            return num * chenjie(num-1);
        }
    }
    public static int dengcahshulie(int num){
        num = num % 2 == 0 ? num -1 : num;
        if (num == 1){
            return 1;
        }else {
            return num + dengcahshulie(num-2);
        }
    }

}
