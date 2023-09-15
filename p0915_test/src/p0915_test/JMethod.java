package p0915_test;

public class JMethod {
	
	JMethod(){ }//생성자

	//인스턴스메소드
	int cal(int n1,int n2) {
		//입력받은 2개의 숫자를 4칙연산
		int result = n1+n2;
		int result2 = n1-n2;
		int result3 = n1*n2;
		int result4 = n1/n2;
		
		return result+result2+result3+result4;
	}//calculate
	
	int cal(int n1,int n2,int n3,int n4) {
		//입력받은 2개의 숫자를 4칙연산
		int result = n1+n2+n3+n4;
		int result2 = n1*n2*n3*n4;
		
		return result+result2;
	}//calculate
	
	int cal(int[] n) {
		//입력받은 2개의 숫자를 4칙연산
		int result = n[0]+n[1]+n[2]+n[3];
		int result2 = n[0]*n[1]*n[2]*n[3];
		
		return result+result2;
	}//calculate
	
}
