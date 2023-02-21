package lianxi_Objectorientedconstruction;

public class jiangshi {
    String name;
    int tack;
    int hp;
    public jiangshi(String name,int tack,int hp){
        this.name=name;
        this.tack=tack;
        this.hp=hp;
    }
    public void eat(zhiwu zw){
        System.out.println("僵尸在吃"+zw.name);
        int a=0;
       for (;a<27;a++){
           if (a%2 == 0)
               zw.hp -=this.tack;

       }
        System.out.println("植物还有多少血量"+zw.hp);
    }
}
