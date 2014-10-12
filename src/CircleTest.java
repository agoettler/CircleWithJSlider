
/*
 * Introduction to Software Design 2014
 * Author: Andrew Goettler
 * Problem: 25.8 Using a JSlider (pg. 1043)
 * Problem description: Write a program that displays a circle with radius
 * 		in the range from 100-200, determined by a JSlider. The diameter, 
 * 		area, and circumference should be displayed and should be updated 
 * 		as the radius is changed. The initial radius should be set to 150.
 */

import javax.swing.JFrame;


public class CircleTest
{
	public static void main(String[] args)
	{
		CircleWithSliderFrame mainFrame = new CircleWithSliderFrame();
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(500,500);
		mainFrame.setVisible(true);
	}
}
