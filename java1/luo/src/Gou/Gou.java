package Gou;

public class Gou {
	private boolean buru = true;
	private boolean roushi = true;
	private  int numbertui = 4;
	private int qingxu=1;
	public Boolean isBuru() {
		
		return (buru);
	} 
	public Boolean isRoushi () {
		return (roushi);
	}
	public int getNumbertui() {
		return (numbertui);
	}
	public void setQingxu(int qingxu) {
		this.qingxu=qingxu;
	
	}
	public String sayHello1() {
		return("ҡҡβ��");
	}
	public String sayHello(int qingxu) {
		this.setQingxu (qingxu);
		switch (this.qingxu) {
		case 1:
			return("�����ؽ�");
		case 2:
			return("��������");
		default:
			return("ҡҡβ��");
		}
	}
	

}
