package Basics;
import java.util.*;
public class StrReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input ");
		String str = sc.nextLine();
		StringBuffer strbf = new StringBuffer();
		 strbf.append(str);
		 System.out.println( strbf.reverse());		
	
		 char[] charr= str.toCharArray();
		for(int i=charr.length -1; i>=0;i--) {
			//System.out.println(charr[i]);
		      String abc = String.valueOf(charr[i]);

		}

	}

}
