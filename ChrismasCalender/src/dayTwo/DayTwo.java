package dayTwo;

import java.awt.Point;

public class DayTwo {

	private String[] array;
	private Point currentPoint;
	private char[][] boardOne = {
			{'#','#','#','#','#'},
			{'#','1','2','3','#'},
			{'#','4','5','6','#'},
			{'#','7','8','9','#'},
			{'#','#','#','#','#'}
	};
	private char[][] board = {
			{'#','#','#','#','#','#','#',},
			{'#','#','#','1','#','#','#',},
			{'#','#','2','3','4','#','#',},
			{'#','5','6','7','8','9','#',},
			{'#','#','A','B','C','#','#',},
			{'#','#','#','D','#','#','#',},
			{'#','#','#','#','#','#','#',}
	};
	
	public DayTwo(String[] array){
		this.array = array;
}
	
	
	public void doDayTwoPartOne(){
		System.out.print("Bathroom code: ");
		currentPoint = new Point(2,2);
		for(int i = 0; i < array.length; i++){
			for(int x = 0; x < array[i].length(); x++){
				switch(array[i].charAt(x)){
				case 'D':
					down(boardOne);
					break;
				case 'U':
					up(boardOne);
					break;
				case 'R':
					right(boardOne);
					break;
				case 'L':
					left(boardOne);
					break;
				default:
					System.out.println("OH SHIT");
					break;
				}
			}
			System.out.print(boardOne[currentPoint.y][currentPoint.x]);
		}
	}
	
	public void doDayTwoPartTwo(){
		System.out.println();
		System.out.println();
		System.out.print("Part two bathroom code: ");
		currentPoint = new Point(1,3);
		for(int i = 0; i < array.length; i++){
			for(int x = 0; x < array[i].length(); x++){
				switch(array[i].charAt(x)){
				case 'D':
					down(board);
					break;
				case 'U':
					up(board);
					break;
				case 'R':
					right(board);
					break;
				case 'L':
					left(board);
					break;
				default:
					System.out.println("OH SHIT");
					break;
				}
			}
			System.out.print(board[currentPoint.y][currentPoint.x]);
		}
	}
	
	public void up(char[][] board){
		if(board[currentPoint.x][currentPoint.y-1] != '#'){
			currentPoint.y--;
		}
	}
	
	public void down(char[][] board){
		if(board[currentPoint.x][currentPoint.y+1] != '#'){
			currentPoint.y++;
		}
	}
	
	public void left(char[][] board){
		if(board[currentPoint.x-1][currentPoint.y] != '#'){
			currentPoint.x--;
		}
	}
	
	public void right(char[][] board){
		if(board[currentPoint.x+1][currentPoint.y] != '#'){
			currentPoint.x++;
		}
	}
	
}
