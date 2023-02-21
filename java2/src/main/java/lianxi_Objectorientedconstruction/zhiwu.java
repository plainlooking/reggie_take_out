package lianxi_Objectorientedconstruction;

public class zhiwu {
    String name;
    int tack;
    int hp;
    public zhiwu(String name,int tack,int hp){
        this.name=name;
        this.tack=tack;
        this.hp=hp;
    }
    public void fig(jiangshi js){
        System.out.println(this.name+"打僵尸");
        int a=0;
        for (;a<27;a++) {
            if (a%2 != 0)
                js.hp -= this.tack;
        }
        System.out.println("僵尸还剩多少血"+js.hp);

    }
}
