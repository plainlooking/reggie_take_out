package lianxi_Objectorientedconstruction;

public class test {
    public static void main(String[] args) {
        zhiwu zw=new zhiwu("豌豆",10,200);
        jiangshi js=new jiangshi("铁桶僵尸",8,240);
        zw.fig(js);
        js.eat(zw);

    }
}
