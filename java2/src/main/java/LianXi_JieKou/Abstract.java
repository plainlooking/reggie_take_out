package LianXi_JieKou;

public abstract class Abstract implements IDAO{
    public void add() {
        System.out.println("增");
    }

    public void del() {
        System.out.println("删");
    }

    public void upd() {
        System.out.println("改");
    }

    public void sel() {
        System.out.println("查");
    }

}
