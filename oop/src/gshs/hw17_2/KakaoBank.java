package hw17_2;

public class KakaoBank implements Bank {
	@Override
	public void withDraw(int price) {
		System.out.print("Kakao은행만의 인출 로직... ");
		if (price < Bank.MAX_INTEGER) {
			System.out.println(price + " 원을 인출한다.");
		} else {
			System.out.println(price + " 원을 인출실패.");
		}
	}

	@Override
	public void deposit(int price) {
		System.out.println("Kakao은행만의 입금 로직... " + price + " 원을 입금한다.");
	}

	@Override
	public String findDormancyAccount(String custId) {
		System.out.println("kakao은행만의 휴면계좌 찾아주기 로직");
		return "00은행 000-000-0000-00";
	}
}
