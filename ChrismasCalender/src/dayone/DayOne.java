package dayone;

import java.awt.Point;
import java.util.ArrayList;

public class DayOne {

	private String[] array;
	private int x = 0, y = 0;
	private int degree = 2; // 3 right, 2 north, 1 left, 0 south
	private ArrayList<Point> points;
	private boolean foundPartTwo = false;
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
				for(int f = 0; f < amount; f++){
					points.add(new Point(x, y-f));
				}
				y-= amount;
				break;
			case 1:
				for(int f = 0; f < amount; f++){
					points.add(new Point(x-f, y));
				}
				x-= amount;
				break;
			case 2:
				for(int f = 0; f < amount; f++){
					points.add(new Point(x, y+f));
				}
				y+= amount;
				break;
			case 3:
				for(int f = 0; f < amount; f++){
					points.add(new Point(x+f, y));
				}
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
		for(int i = 0; i < points.size(); i++){
			for(int f = 0; f < points.size(); f++){
				if(f != i){
					if(points.get(i).x == points.get(f).x){
						if(points.get(i).y == points.get(f).y){
							x = points.get(i).x;
							y = points.get(i).y;
							if(x < 0){
								x = -x;
							}
							if(y < 0){
								y = -y;
							}
							System.out.println("Part two distance: "+(x+y));
							return;
						}
					}
				}
			}
		}
	}
	
}
