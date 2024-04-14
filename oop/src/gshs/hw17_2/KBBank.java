package hw17_2;

public class KBBank implements Bank {
	@Override
	public void withDraw(int price) {
		System.out.print("KB은행만의 인출 로직... ");
		if (price < Bank.MAX_INTEGER) {
			System.out.println(price + " 원을 인출한다.");
		} else {
			System.out.println(price + " 원을 인출실패.");
		}
	}

	@Override
	public void deposit(int price) {
		System.out.println("KB은행만의 입금 로직... " + price + " 원을 입금한다.");
	}
}
