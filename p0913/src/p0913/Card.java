package p0913;

public class Card {
	
	Card(){}
	Card(String kind,int number){
		this.kind = kind;
		this.number = number;
	}
	
	String kind; //모양 Spade,Heart,Diamond,Clover
	int number;  //1,2,3,4,5 ..11(J),12(Q),13(K)
	private int flag;
	
	String[] CardShape = {"0","1","2","3","4","5","6","7",
			"8","9","10","J","Q","k"};
	
	@Override
	public String toString() {
		return String.format("[ %s,%s ]",kind, CardShape[number]);
	}

}
