package hw11;

public class Mp3 {
	private String comp;
	private String size;

	public Mp3(String comp, String size) {
		this.comp = comp;
		this.size = size;
	}

	public Mp3(String comp) {
		this.comp = comp;
		this.size = new String("2GB");
	}

	public Mp3() {
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

	public static void main(String[] args) {
		Mp3 mp3_1 = new Mp3("아이리버", "4GB");
		Mp3 mp3_2 = new Mp3("삼성");
		Mp3 mp3_3 = new Mp3();
		mp3_1.print();
		mp3_2.print();
		mp3_3.print();
	}
}
