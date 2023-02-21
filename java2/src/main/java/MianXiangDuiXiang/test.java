package MianXiangDuiXiang;

public class test {
    public static void main(String[] args) {
        Game game1=new DNF();
        Game game2=new LOL();
        Game game3=new CS();
        Person p=new Person();
        p.Happy(game1);
        p.Happy(game2);
        p.Happy(game3);
    }
}
