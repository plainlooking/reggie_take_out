package Gou;

public class TestGou {
	public static void main (String [] args) {
		Gou gou=new Gou();
		if(gou.isBuru()) {
			System.out.print("狗是哺乳动物\n");
		}
		else {
			System.out.println("狗不是哺乳动物\n");
		}
		if(gou.isRoushi()) {
			System.out.print("狗是肉食动物\n");
		}
		else {
			System.out.print("狗不是肉食动物\n");
		}
		System.out.println("狗正常情况下，和人打招呼的方式：\n" +gou.sayHello(0));
		System.out.println("狗被抚摸情绪好的时候，打招呼的方式是：\n"+gou.sayHello(2));
		System.out.println("狗烦躁的时候会：\n"+gou.sayHello(1));
		System.out.println("狗有：\n"+gou.getNumbertui()+"条腿");
	}

}
