package clear;

import dayone.DayOne;
import daytwo.DayTwo;

public class Main {

	public static void main(String[] args) {
		//new DayOne(Loader.loadToArray(",", true, 1)).doDayOne();
		DayTwo daytwo = new DayTwo(Loader.loadToArray(",", false, 1));
		daytwo.doDayTwoPartOne();
		daytwo.doDayTwoPartTwo();
	}

}
