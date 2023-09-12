package p0912;

public class J0912_01 {

	public static void main(String[] args) {
		Time t = new Time();
		Data1 d1 = new Data1(); 
		Data2 d2 = new Data2();
		
		Car c1 = new Car();
		System.out.println(c1.color);
		
		Car c2 = new Car("red","auto",5);
		System.out.println(c2.color); //red
		System.out.println(c2.gearType);
		
		
	}//main

}
