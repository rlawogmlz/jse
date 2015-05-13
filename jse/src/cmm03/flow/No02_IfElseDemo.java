package cmm03.flow;

import java.util.Scanner;

public class No02_IfElseDemo {	
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);//[Scanner | scanner] Class | Instance(첫글자가 대문자인건 Class 밖에없음)
		System.out.println("값을 입력하세요..");
		/*int i;
		i = 0;*/
		int i = 0;
		i = scanner.nextInt();
		System.out.println(" 입력값은 "+i+" 입니다.");
		scanner.close();
	}
}