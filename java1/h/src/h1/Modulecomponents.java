package h1;
import java.util.Random;
//ģ����
public class Modulecomponents {
	//Cameramodule ���ģ��
	static int Cameramodule=1000;
	//Communication module ͨ��ģ��
	static int Communicationmodule=1000;
	/*creenmodules ��Ļģ��*/
	static int intScreenmodules=1000;
	//Chipmodules оƬģ��
	static int Chipmodules=1000;
	
	public Modulecomponents(int Cameramodule1, int Communicationmodule1, int intscreenmodules1, int Chipmodules1 ) {
		this.Cameramodule=Cameramodule1;
		
		this.Communicationmodule=Communicationmodule1;
		
		this.intScreenmodules=intscreenmodules1;
		
		this.Chipmodules=Chipmodules1;
	}
	int area() {
		int e=Cameramodule/100*10;
		   java.util.Random random=new java.util.Random();
		    for (int i=0;i<e;i++) { 
		    	int	a1=random.nextInt(1000);
		    }
		    System.out.println(e);
		    
		   int s=Communicationmodule/100*10;
			   java.util.Random random1=new java.util.Random();
			    for (int i=0;i<s;i++) {
			    	int	a2=random1.nextInt(1000);
			    }
			    System.out.println(s);
			    
			int y=intScreenmodules/100*10;
				   java.util.Random random2=new java.util.Random();
				    for (int i=0;i<y;i++) {
				    	int	a3=random1.nextInt(1000);			    	
				    }
				    System.out.println(y);
		       
	
			int f=Chipmodules/100*10;
			   java.util.Random random4=new java.util.Random();
					    for (int i=0;i<f;i++) {
					    	int	a4=random1.nextInt(1000);			    	
					    }
					 System.out.println(f);   
		return (e+s+y+f) /1000; 		    
	}

	}