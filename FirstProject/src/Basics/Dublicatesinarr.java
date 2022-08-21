package Basics;

import java.util.Scanner;

public class Dublicatesinarr {

	public static void main(String[] args) {

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a String");
			String Str = sc.nextLine();
			
			String word[] = Str.split (" ");
			for(int i=0;i<word.length;i++) {
				int count = 1;

				for(int j= i+1;j<word.length;j++) {
					//System.out.println(word[j]);

					if (word[i].equalsIgnoreCase(word[j])) {
						count++;
						//System.out.println(word[j]);

					}
				}
				if(count>1) {
				System.out.println(word[i]);
				}
			}
		}


	}


