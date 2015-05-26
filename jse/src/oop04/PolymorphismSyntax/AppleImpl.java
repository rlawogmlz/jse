package oop04.PolymorphismSyntax;

public class AppleImpl implements FruitInterface{

	@Override
	public void dispaly(String s) {
		System.out.println(s + " 사과입니다.");
	}
	
}
