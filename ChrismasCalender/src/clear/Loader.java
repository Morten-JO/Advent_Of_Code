package clear;

import java.util.Scanner;

public class Loader {

	public static String[] loadToArray(String reg, boolean white, int lines){
		Scanner scanner = new Scanner(System.in);
		System.out.print("String: ");
		String scanned = "";
		for(int i = 0; i < lines; i++){
			scanned += scanner.nextLine();
		}
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
