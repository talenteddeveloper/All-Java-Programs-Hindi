package allPrograms;

import java.util.Scanner;

public class ReadInt {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int num = reader.nextInt();
		System.out.println("Entered number:" + num);
	}

}
