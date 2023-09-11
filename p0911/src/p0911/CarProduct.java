package p0911;

public class CarProduct {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color = "White";
		c1.gearType = "auto";
		c1.door = 5;
		
		Car c2 = new Car();
		c2.color = "red";
		c2.gearType = "auto";
		c2.door = 4;
		
		Car c3 = new Car();
		c3.color = "black";
		c3.gearType = "auto";
		c3.door = 5;
		
		Car c4 = new Car("Silver","auto",5);
		Car c5 = new Car("green","auto",4);
		Car c6 = new Car("pink","stick",5);
		
//		Time t1 = new Time();
//		t1.hour = 10;
//		t1.minute = 10;
//		t1.second = 10;
//		
//		Time t2 = new Time(10,10,10);
	}

}//class

