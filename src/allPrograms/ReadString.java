package allPrograms;

import java.util.Scanner;

public class ReadString {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter a name");
		String name = reader.nextLine();
		System.out.println("Name entered by user:"+name);
	}

}
