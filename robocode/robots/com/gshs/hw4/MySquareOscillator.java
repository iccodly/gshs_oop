package com.gshs.hw4;

import robocode.*;

public class MySquareOscillator extends Robot {
	public void run() {
		for (int cnt = 1; true; cnt += 1) {
			if (cnt % 2 == 1) {
				for (int i = 0; i < 4; i++) {
					ahead(150);
					turnRight(90);
				}
			} else {
				for (int i = 0; i < 4; i++) {
					ahead(150);
					turnLeft(90);
				}
			}
			System.out.println(cnt);
		}
	}
}
