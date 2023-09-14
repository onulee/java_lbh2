package p0914;

public class J0914_03 {

	public static void main(String[] args) {
		Car c; //주소값만 존재
		
		FireEngine f1 = new FireEngine();
		
		System.out.println("[ f1 기능 ]");
		f1.go();
		f1.stop();
		f1.water();
		
		c = f1; //FireEngine Car형변환 생략가능
		Amblance a1 = new Amblance();
		c = a1; //Amblance Car형변환
		
		System.out.println("[ c 기능 ]");
		c.go();
		c.stop();
		//c에는 water()공간은 있지만 c참조변수는 water()사용할수 없음
		//c.water(); 사용불가
		FireEngine f2; //주소값
		Amblance a2;
		if (c instanceof FireEngine) {
			System.out.println("[ f2 기능 ]");
			f2 = (FireEngine)c;
			f2.go();
			f2.stop();
			f2.water();
		}
		
		if (c instanceof Amblance) {
			System.out.println("[ a2 기능 ]");
			a2 = (Amblance)c;
			a2.go();
			a2.stop();
			a2.siren();
		}
		
		//a2 = (Amblance)c; //FireEngine
		//f2 = (FireEngine)c; //FireEngine 형변환 생략불가
		

	}

}
