package oop04.PolymorphismSyntax;


public class OrangeImpl implements FruitInterface{

	public void dispaly(String s) {
		System.out.println(s + " 오렌지입니다.");
	}
	public int getCount(){
		return 100;
	}
	
}
