package p0913;

public class Buyer {
	String id="aaa";
	String name="hong";
	int money = 10000000;
	int bonusPoint = 0;
	
	//Tv를 구매했을때 사용하는 메소드
	void buy(Product p) {
		money = money - p.price;
		bonusPoint += p.bonusPoint;
	}
	
	

}
