package yhguanli;

public class yonghu {
	private String name;
	private String aihao;
	private int zhanghao;
	private int mima;
	public yonghu(String name,String aihao,int zhanghao,int mima) {
		super();
		
		this.name=name;
		this.aihao=aihao;
		this.zhanghao=zhanghao;
		this.mima=mima;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		
		this.name=name;		
	}
	public String getAihao() {
			return aihao;
	}
	public void setAihao(String aihao) {
		this.aihao=aihao;
	}
	public int getZhanghao() {
		return zhanghao;
	}
	public void setZhanghao(int zhanghao) {	
		this.zhanghao=zhanghao; 
	}
	public int getMima() {
		return mima;
	}
	public void setMima(int mima) {
		this.mima=mima;		
	}

}
