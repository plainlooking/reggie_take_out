package Gou;

public class TestGou {
	public static void main (String [] args) {
		Gou gou=new Gou();
		if(gou.isBuru()) {
			System.out.print("���ǲ��鶯��\n");
		}
		else {
			System.out.println("�����ǲ��鶯��\n");
		}
		if(gou.isRoushi()) {
			System.out.print("������ʳ����\n");
		}
		else {
			System.out.print("��������ʳ����\n");
		}
		System.out.println("����������£����˴��к��ķ�ʽ��\n" +gou.sayHello(0));
		System.out.println("�������������õ�ʱ�򣬴��к��ķ�ʽ�ǣ�\n"+gou.sayHello(2));
		System.out.println("�������ʱ��᣺\n"+gou.sayHello(1));
		System.out.println("���У�\n"+gou.getNumbertui()+"����");
	}

}
