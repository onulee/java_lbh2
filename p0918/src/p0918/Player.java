package p0918;

abstract public class Player {
	int currentPos; //현재 위치저장변수
	
	Player(){
		currentPos = 0;
	}

	abstract void play(int pos);
	abstract void stop();
	
	void play() {
		play(currentPos); //play(int pos) 상메소드 호출
	}
	
	
	
	
	
}
