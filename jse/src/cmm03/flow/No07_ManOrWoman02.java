package cmm03.flow;

import java.util.Scanner;

public class No07_ManOrWoman02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("주민번호 입력 (ex.123456-7891023) : ");
		String ssn = scanner.nextLine();
		
		char ch = ssn.charAt(7);
		switch (ch) {
		case '1': case '2': System.out.println("Man"); break;
		case '3': case '4': System.out.println("Woman"); break;
		default: System.out.println("값이 틀렸습니다."); break;
		}
		scanner.close();
	}
}
