package Basics;

public class firstClass {

	public static void main(String[] args) {

		int h=65;
		for (int i=0;i<4;i++) {
			//System.out.print("*");
			for (int j=0;j<=i;j++) {
				System.out.print((char)(h++));
			}
			System.out.println("");

		}
	}

}
