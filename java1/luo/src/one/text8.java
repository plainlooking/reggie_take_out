package one;

public class text8 {
	public static void main(String[]args) {
		text9 c1=new text9(new text7(1.0,2.0),2.0);
		text9 c2=new text9(5.0);
		System.out .println("c1:("+c1.get0().getx()+","+c1.get0().gety()+"),"+c1.getRadius());
		System.out.println("c1 area="+c1.area());
		System.out.println(c1.contains(new text7(1.0,2.0)));
	}
		
}
	
