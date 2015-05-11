package cmm01.var;

class No01_PrimVar {
	public static void main(String[] args) {
		/*
		 * 변수의 종류 8가지
		 * 문자 Type : char
		 * 숫자(정수) Type : byte, short, int, long
		 * 숫자(실수) Type : float, double
		 * 논리 타입 : boolean 
		 * */
		int x;	// 변수의 선언
		x = 1;	// 할당연산자를 사용한 값의 할당(대입)
		int y;
		y = x + 1;
		System.out.println("Hellow JAVA !!" + " " + (x + y));
		System.out.println("x+1 의 값 : "+y);
	}
}