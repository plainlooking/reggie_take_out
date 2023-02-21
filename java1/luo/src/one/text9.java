package one;

public class text9 {
	private text7 o;
	private double radius;
	text9(text7 p,double r){
		o=p;
		radius=r;
		                                                                                                                                                                  
	}
	text9(double r){
		o=new text7(0.0,0.0);;
		radius=r;
	}
	boolean contains(text7 p) {
		double x=p.getx()-o.getx();
		double y=p.gety()-o.gety();
		if(x*y+y*y>radius*radius) return false;
		else return true;
	}
	public void set0(double x,double y) {
		o.setx(x);
		o.sety(y);

	}
	public text7 get0() {
		return o;
		
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double r) {
		radius=r;
	}
	public double area() {
		return 3.14*radius*radius;
	}

}
