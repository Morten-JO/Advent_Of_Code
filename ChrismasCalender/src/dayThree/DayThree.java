package dayThree;

public class DayThree {

	private String[] array;
	
	public DayThree(String[] array){
		this.array = array;
	}
	
	
	public void doDayThree(){
		int count = 0;
		System.out.println("started");
		for(int i = 0; i < array.length; i++){
			array[i] = trueTrim(array[i]);
			String[] splitted = array[i].split(" ");
			int first = Integer.parseInt(splitted[0]);
			int second = Integer.parseInt(splitted[1]);
			int last = Integer.parseInt(splitted[2]);
			if(isValidTriangle(first, second, last)){
				count++;
			}
		}
		System.out.println("count: "+count);
	}
	
	public void doDayThreePartTwo(){
		int count = 0;
		System.out.println("started");
		for(int i = 0; i < array.length; i+= 3){
			array[i] = trueTrim(array[i]);
			array[i+1] = trueTrim(array[i+1]);
			array[i+2] = trueTrim(array[i+2]);
			String[] splittedOne = array[i].split(" ");
			String[] splittedTwo = array[i+1].split(" ");
			String[] splittedThree = array[i+2].split(" ");
			if(isValidTriangle(Integer.parseInt(splittedOne[0]), Integer.parseInt(splittedTwo[0]), Integer.parseInt(splittedThree[0]))){
				count++;
			}
			if(isValidTriangle(Integer.parseInt(splittedOne[1]), Integer.parseInt(splittedTwo[1]), Integer.parseInt(splittedThree[1]))){
				count++;
			}
			if(isValidTriangle(Integer.parseInt(splittedOne[2]), Integer.parseInt(splittedTwo[2]), Integer.parseInt(splittedThree[2]))){
				count++;
			}
			
		}
		System.out.println("count: "+count);
	}
	
	private String trueTrim(String str){
		while(str.contains("  ")){
			str = str.replace("  ", " ");
		}
		while(str.startsWith(" ")){
			str = str.substring(1, str.length());
		}
		return str;
	}
	
	private boolean isValidTriangle(int a, int b, int c){
		return (a+b) > c && (a+c) > b && (b+c) > a;
	}
	
}
