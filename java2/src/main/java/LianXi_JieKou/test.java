package LianXi_JieKou;

import java.util.Scanner;

public  class test {
    public static void main(String[] args) {
//        IDAO M=new MySql();
//        M.add();
//        M.del();
//        M.upd();
//        M.sel();
//        M.connect();
        System.out.println("请问您要哪个数据库：1，MySql  2，Oracle ：");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        IDAO R;
        if (n == 1) {
             R = new MySql();
        }

        else  {
            R =new Oracle();
        }
       R.connect();
       R.add();
       R.del();
       R.upd();
       R.sel();


    }
}
