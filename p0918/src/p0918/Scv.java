package p0918;

public class Scv extends GroundUnit implements Repairable{

	Scv() {
		super(40);
		hitPoint = MAX_HP;
		name="SCV";
	}
	
	void repair(Repairable g) {
		if(g instanceof Unit) {
			Unit u = (Unit)g;
			while(u.hitPoint!=u.MAX_HP) {
				u.hitPoint++;
			}
		}
	}

	@Override
	void move(int x, int y) {
		System.out.printf("%s : [x:%d, y:%d] 좌표로 이동!\n",name,x,y);
	}

}
