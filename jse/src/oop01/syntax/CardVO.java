package oop01.syntax;

public class CardVO {
	String kind; // 카드의 무늬
	int number; // 카드의 숫자
	static int width=150; // 카드의 너비
	static int height=300; // 카드의 높이
	
	public CardVO(String kind, int num){
		System.out.println("카드는 " + kind + " 이고 숫자는 " + num + " 입니다.");
		this.kind = kind;
		number = num;
	}
	
	void getCard(){
		
	}
}
