package p0912;

public class J0912_05 {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.pName = "led55";
		p1.price = 50;
		Product p2 = new Product("led60",100);
		Product p3 = new Product("led70",200);
		Product p4 = new Product("led75");
		Product p5 = new Product();
		p5.pName = "led100"; 
		p5.price = 400;
		
		System.out.println("p1번호 : "+p1.serialNo);
		System.out.println("p1제품이름 : "+p1.pName);
		System.out.println("p1가격 : "+p1.price);
		System.out.println("p2번호 : "+p2.serialNo);
		System.out.println("p2제품이름 : "+p1.pName);
		System.out.println("p2가격 : "+p1.price);
		System.out.println("p3번호 : "+p3.serialNo);
		System.out.println("p4번호 : "+p4.serialNo);
		System.out.println("p5번호 : "+p5.serialNo);
		
		
	}//main

}
