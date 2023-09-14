package p0914;

import java.util.ArrayList;

public class Buyer {
	
	Buyer(){}
	Buyer(String id,String name){
		this.id = id;
		this.name = name;
	}
	
	String id;
	String name;
	int money=10000000;
	int bonusPoint = 0;
	//Product[] cart = new Product[10];
	//컬렉션 선언
	ArrayList list = new ArrayList();
	
	void buy(Product p) {
		money -= p.price;
		bonusPoint += p.bonusPoint;
		list.add(p);
	}
	
	
	
	
	
	

}
