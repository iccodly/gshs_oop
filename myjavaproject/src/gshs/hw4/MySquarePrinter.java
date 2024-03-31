package hw4;

import robocode.*;

public class MySquarePrinter extends Robot {
	public void run() {
		for (int cnt = 1; true; cnt += 1) {
			for (int i = 0; i < 4; i++) {
				ahead(150);
				turnRight(90);
			}
			System.out.println(cnt);
		}
	}
}
