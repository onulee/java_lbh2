package p0912;

public class Car {
	String color;
	String gearType;
	int door;
	
	Car(){ //기본생성자
		this("white","auto",5); //다른생성자 호출시 this()
	} 
	
	Car(Car c){
		this(c.color,c.gearType,c.door); // this() : 다른 생성자 호출
	}
	
	Car(String color,String gearType,int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}

}
