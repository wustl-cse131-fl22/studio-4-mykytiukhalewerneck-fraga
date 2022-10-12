package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		
		StdDraw.setXscale(0, 24);
		StdDraw.setYscale(0, 16);
		

		StdDraw.clear();
		StdDraw.setPenColor(255, 120, 0);
		StdDraw.filledRectangle(0, 0, 25, 20);
		
		StdDraw.setPenColor(100, 0, 127);
		StdDraw.filledRectangle(6, 3, 20, 1);
		StdDraw.filledRectangle(12, 6, 20, 1);
		StdDraw.filledRectangle(12, 12, 20, 1);
		StdDraw.setPenColor(54, 30, 127);
		StdDraw.filledCircle(11, 8, 7);
		StdDraw.setPenColor(200, 200, 10);
		StdDraw.filledCircle(11, 8, 3);
		StdDraw.setPenColor(54, 30, 127);
		StdDraw.filledCircle(0, 8, 2);
		StdDraw.filledCircle(24, 8, 2);
		
		StdDraw.setPenColor(200, 220, 100);
		StdDraw.filledCircle(0, 0, 1);
		StdDraw.filledCircle(0, 16, 1);
		StdDraw.filledCircle(24, 16, 1);
		StdDraw.filledCircle(24, 0, 1);

		StdDraw.setPenColor(225, 0, 0);
		StdDraw.filledRectangle(10, 9, .1, .4);
		StdDraw.filledRectangle(12, 9, .1, .4);
		StdDraw.filledRectangle(11, 7, .5, .4);





		//StdDraw.filledRectangle(8, 8, 1, 8);
	}
}