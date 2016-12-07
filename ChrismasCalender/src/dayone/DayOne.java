package dayone;

import java.awt.Point;
import java.util.ArrayList;

public class DayOne {

	String[] array;
	int x = 0, y = 0;
	int degree = 2; // 3 right, 2 north, 1 left, 0 south
	ArrayList<Point> points;
	public DayOne(String[] array){
		this.array = array;
		points = new ArrayList<Point>();
	}
	
	public void doDayOne(){
		for(int i = 0; i < array.length; i++){
			if(array[i].contains("L")){
				if(degree == 0){
					degree = 3;
				} else{
					degree--;
				}
			} else {
				if(degree == 3){
					degree = 0;
				} else{
					degree++;
				}
			}
			int amount = Integer.parseInt(array[i].substring(1, array[i].length()));
			switch(degree){
			case 0:
				y-= amount;
				break;
			case 1:
				x-= amount;
				break;
			case 2:
				y+= amount;
				break;
			case 3:
				x+= amount;
				break;
			}
		}
		if(x < 0){
			x = -x;
		}
		if(y < 0){
			y = -y;
		}
		System.out.println("Distance: "+(x+y));
		System.out.println("Part two Distance: ");
	}
	
}
