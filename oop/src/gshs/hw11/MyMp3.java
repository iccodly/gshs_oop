package hw11;

public class MyMp3 {
	private String comp;
	private String size;

	public MyMp3(String comp, String size) {
		this.comp = comp;
		this.size = size;
	}

	public MyMp3(String comp) {
		this.comp = comp;
		this.size = new String("2GB");
	}

	public MyMp3() {
		this.comp = new String("아이팟");
		this.size = new String("2GB");
	}

	public String getComp() {
		return this.comp;
	}

	public void setComp(String comp) {
		this.comp = comp;
	}

	public String getSize() {
		return this.size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void print() {
		System.out.println("제조회사명 : " + getComp() + " 메모리용량 : " + getSize());
	}
}
