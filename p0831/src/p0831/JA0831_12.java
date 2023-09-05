package p0831;

public class JA0831_12 {

	public static void main(String[] args) {
		int i = 5;
		int j = 0;
		
		j = ++i;
		//System.out.println(i); //6
		//System.out.println(j); //6
		
		int a = 5;
		int b = 0;
		a++;
		b = a;
		
		// b = a++; 대입연산자를 함께 사용하지 말것, 분리해서 사용할 것
		//x--;
		//--x;
		//++x;
		
		//System.out.println(a); //6
		//System.out.println(b); //5
		
		int x = 5;
		int y = 0;
		int z = 5;
		
		x++;
		y = x;
		
		System.out.println(x==y);
		System.out.println(x!=z);
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1==str2);   //8가지 기본형타입은 등가비교 사용
		System.out.println(str1.equals(str2));  //참조변수는 equals명령어 사용해야 함.
		
		
		

	}

}
