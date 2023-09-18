package p0918;

public class DropShip extends Unit {

	DropShip(){ //기본생성자
		name = "DropShip";
	}
	
	@Override
	void move(int x, int y) {
		System.out.printf("%s : [x:%d, y:%d] 좌표로 이동!\n",name,x,y);

	}

}
