package p0912;

public class J0912_08_card {

	public static void main(String[] args) {
		
		Deck d = new Deck();
		d.cardPrint();
		d.shuffle();
		System.out.println("---------");
		d.cardPrint();
		System.out.println("---------");
		System.out.println("카드 한장 출력 : ");
		System.out.println(d.pick(3));
		System.out.println("---------");
		System.out.println(d.pick());
	
		
		
		

	}

}
