package p0918;

public class DropShip extends AirUnit implements Repairable {

	DropShip(){ //기본생성자
		super(120);
		hitPoint = MAX_HP;
		name = "DropShip";
	}
	
	@Override
	void move(int x, int y) {
		System.out.printf("%s : [x:%d, y:%d] 좌표로 이동!\n",name,x,y);

	}

}
