package cmm04.array;

public class GugudanVO {
	public void calc(){
		for( int s = 1; s < 10; s++){
			for( int dan = 2; dan < 6; dan++){
				System.out.print(dan + " * " + s + " = " +dan*s + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for( int s = 1; s < 10; s++){
			for( int dan = 6; dan < 10; dan++){
				System.out.print(dan + " * " + s + " = " +dan*s + "\t");
			}
			System.out.println();
		}
	}
}
