package hw3;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputExample {
	public static void main(String[] args) {
		InputStreamReader rd = new InputStreamReader(System.in);
		try {
			while (true) {
				int a = rd.read();
				if (a == -1) { // ctrl-z가 입력되면 read()는 -1을 리턴
					break;
				}
				System.out.println((char) a); // 입력된 문자 출력
			}
		} catch (IOException e) {
			System.out.println("입력 에러 발생");
		}
	}
}
