package clear;

import java.util.Scanner;

public class Loader {

	public static String[] loadToArray(String reg, boolean white){
		Scanner scanner = new Scanner(System.in);
		System.out.print("String: ");
		String scanned = scanner.nextLine();
		String[] splitted = scanned.split(",");
		if(white){
			for(int i = 0; i < splitted.length; i++){
				splitted[i] = splitted[i].trim();
			}
		}
		scanner.close();
		return splitted;
	}
	
}
