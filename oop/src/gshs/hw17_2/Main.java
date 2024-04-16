package hw17_2;

public class Main {
	public static void main(String[] args) {
		Bank bank = new KBBank();
		bank.withDraw(100);
		bank.deposit(100);
		bank.findDormancyAccount("763231");
		Bank.BCAuth("KBBank");

		System.out.println("\n**************인스턴스 교체!!******************\n");

		bank = new SHBank();
		bank.withDraw(100);
		bank.deposit(100);
		bank.findDormancyAccount("4311");
		Bank.BCAuth("SHBank");

		System.out.println("\n***********카카오은행 연동 성공!!***************\n");

		// KakaoBank 클래스는 Bank 인터페이스를 구현해야 합니다.
		// 그런데 kakaoWithDraw 메소드와 kakaoDeposit 메소드를 사용하였으므로 Bank 인터페이스의 추상 메소드를 구현하지 않았습니다.
		// 따라서 오류가 발생합니다.
		bank = new KakaoBank();
		bank.withDraw(100);
		bank.deposit(100);
		bank.findDormancyAccount("4311");
		Bank.BCAuth("KakaoBank");

		System.out.println("\n************대학교 주은행 교체!!****************\n");

		bank = new KBBank();
		bank.withDraw(20000);
		bank.deposit(1000);
		bank.findDormancyAccount("855512");
		Bank.BCAuth("SHBank");
	}
}
