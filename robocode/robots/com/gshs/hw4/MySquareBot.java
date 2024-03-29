package com.gshs.hw4;

import robocode.*;

public class MySquareBot extends Robot {
	public void run() {
		for (int i = 0; i < 4; i++) {
			ahead(150);
			turnRight(90);
		}
	}
}
