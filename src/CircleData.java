
/*
 * Introduction to Software Design 2014
 * Author: Andrew Goettler
 * Problem: 25.8 Using a JSlider (pg. 1043)
 * Problem description: Write a program that displays a circle with radius
 * 		in the range from 100-200, determined by a JSlider. The diameter, 
 * 		area, and circumference should be displayed and should be updated 
 * 		as the radius is changed. The initial radius should be set to 150.
 */

public class CircleData
{
	/**
	 * This method calculates the diameter of a circle of a given radius.
	 * 
	 * @param radius
	 * @return diameter of the circle
	 */
	// instance method for calculating diameter
	public int getDiameter(int radius)
	{
		return (2 * radius);
	}
	
	/**
	 * This method calculates the area of a circle of a given radius.
	 * 
	 * @param radius
	 * @return area of the circle
	 */
	// instance method for calculating area
	public int getArea(int radius)
	{
		return (int) (Math.PI * Math.pow(radius, 2));
	}
	
	/**
	 * This method calculates the circumference of a circle of a given radius.
	 * 
	 * @param radius
	 * @return circumference of the circle
	 */
	// instance method for calculating circumference
	public int getCircumference(int radius)
	{
		return (int) (2 * Math.PI * radius);
	}
}
