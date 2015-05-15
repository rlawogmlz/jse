package cmm04.array;

public class MultiDimArrayDemo {
	public static void main(String[] args) {
		String[][] names= {
				{"Mr.", "Ms.", "Mrs"},
				{"smith", "Johns", "Alex"}};
		System.out.println(names[0][0] + names[1][0]); // Mr.Smith
		System.out.println(names[1][0] + names[1][2]); // Ms.Alex
	}
}
