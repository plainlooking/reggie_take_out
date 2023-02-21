package lianxi_structure;

import javax.xml.namespace.QName;

public class test {
    String name;
    String Skill_Q;
    String Skill_W;
    String Skill_E;
    String Skill_R;
    public test(String name) {
        this.name = name;
    }

    public test(String name,String Skill_Q, String Skill_W, String Skill_E, String Skill_R) {
        this(name);//调用其他构造方法
        this.Skill_Q = Skill_Q;
        this.Skill_W = Skill_W;
        this.Skill_E = Skill_E;
        this.Skill_R = Skill_R;
    }
    public void  kill(){
        System.out.println(this.name+"杀敌");

    }


    public static void main(String[] args) {
        test yx=new test("盖伦","沉默","防御","转转转","大宝剑");
        yx.kill();
    }

}
