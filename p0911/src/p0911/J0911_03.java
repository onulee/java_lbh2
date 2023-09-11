package p0911;

public class J0911_03 {

	public static void main(String[] args) {
		// Card 객체 4개를 선언해서, Heart,1 Spade,1 Diamond,1 Clover,1을
		// 출력하시오.

		String[] shape = { "Heart", "Spade", "Diamond", "Clover" };

		Card[] c = new Card[52]; //13장 카드를 Heart,1-13 13장 Spade,1-13    13*4 = 52
		for (int i = 0; i < c.length; i++) {
			c[i] = new Card(); // 객체선언 - 참조변수명.변수명
			c[i].kind = shape[i/13];
			c[i].number = i%13 + 1; //15%13 ->  
			c[i].cardPrint();
		}
		
		System.out.println("카드 숫자 합 : ");
		//int result = J0911_05.add(c[0].number,c[5].number);
		//System.out.println(result);

	}

}
