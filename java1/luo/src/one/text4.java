package one;

public class text4 {
/*	public static void main(String []args){
		int a=2;
		int b=3;
		a +=b;
		System.out.println(a);
		a *=b;
		System.out.println(a);
	}*/


/*	public static void main(String[]args) {
		short s = 3;
		int i = 5;
		System.out.println("s = "+s);
	}*/
	public static void main(String []args) {
		final int WINDOW_WIDTH = 800;
		final int WINDOW_HEIGHT = 800;
		final float PI = 3.1415926F;
		int x = 0;
		int y = 0;
		int w = 50;int h = 50;
		int speed = 10;
		boolean islive = true;
		float direction = PI/4;
		int bulletSpeed = speed * 2;
		System.out.println("坦克当前位置：x=" +x+" y=" +y);
		System.out.println("坦克向右横向运动一帧");
		x=x+speed;
		System.out.println("坦克当前位置：x1=" +x+" y1=" +y);
		System.out.println("坦克向下纵向运动一帧");
		y+=speed;
		System.out.println("坦克当前位置：x2=" +x+" y2=" +y);
		System.out.println("坦克斜向45度运动一帧");
		x+=speed;Math.cos (direction);
		System.out.println("坦克当前位置：x3=" +x+" y3=" +y);
	}
}