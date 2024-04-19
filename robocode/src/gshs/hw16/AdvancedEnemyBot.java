package hw16;

import robocode.*;

public class AdvancedEnemyBot extends EnemyBot {
	private double x;
	private double y;

	public AdvancedEnemyBot() {
		super();
		reset();
	}

	@Override
	public void reset() {
		super.reset();
		this.x = 0.0;
		this.y = 0.0;
	}

	public void update(ScannedRobotEvent e, Robot robot) {
		super.update(e);
		// 로봇이 보고 있는 위치와 로봇이 보는 방향을 기준으로 측정한 적 로봇의 각도의 합은, 지도상에서의 절대적인 각도와 같다
		double absBearingDeg = (robot.getHeading() + e.getBearing());
		if (absBearingDeg < 0) {
			absBearingDeg += 360;
		}
		//           dist * sin
		//             -------
		//             |    /
		//             |   /
		//  dist * cos |  / distance
		//             | /
		//             |/ <- theta

		// 북쪽이 0도이므로, 떨어진 거리와 북쪽으로부터의 각도의 사인값의 곱이 x좌표의 차이가 된다.
		// 이를 자신의 x좌표와 더하면 적의 x좌표를 알 수 있다.
		x = robot.getX() + Math.sin(Math.toRadians(absBearingDeg)) * e.getDistance();
		// 북쪽이 0도이므로, 떨어진 거리와 북똑으로부터의 각도의 코사인값의 곱이 y좌표의 차이가 된다.
		// 이를 자신의 y좌표와 더하면 적의 y좌표를 알 수 있다.
		y = robot.getY() + Math.cos(Math.toRadians(absBearingDeg)) * e.getDistance();
	}

	public double getX() {
		return this.x;
	}

	public double getY() {
		return this.y;
	}

	public double getFutureX(long when) {
		// 적의 x좌표에서 적이 향하는 방향으로, 적의 속도로 when 시간만큼 움직였을 때 적의 미래의 x좌표를 구할 수 있다.
		// x좌표이므로 위와 같은 이유로 sin을 이용한다.
		return x + Math.sin(Math.toRadians(getHeading())) * getVelocity() * when;
	}

	public double getFutureY(long when) {
		// 적의 y좌표에서 적이 향하는 방향으로, 적의 속도로 when 시간만큼 움직였을 때 적의 미래의 y좌표를 구할 수 있다.
		// y좌표이므로 위와 같은 이유로 cos를 이용한다.
		return y + Math.cos(Math.toRadians(getHeading())) * getVelocity() * when;
	}
}
