
/*
 * Introduction to Software Design 2014
 * Author: Andrew Goettler
 * Problem: 25.8 Using a JSlider (pg. 1043)
 * Problem description: Write a program that displays a circle with radius
 * 		in the range from 100-200, determined by a JSlider. The diameter, 
 * 		area, and circumference should be displayed and should be updated 
 * 		as the radius is changed. The initial radius should be set to 150.
 */

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Dimension;


public class CirclePanel extends JPanel
{
	static final long serialVersionUID = -4345411131235608478L; // eliminates "serializable" warning
	private int radius = 150; // radius, default of 150
	
	/**
	 * This instance method returns the current radius of the circle.
	 * 
	 * @return radius of the circle
	 */
	// instance method for getting the current radius
	public int getRadius()
	{
		return radius;
	}
	
	/**
	 * This method paints the circle in the CirclePanel.
	 */
	// instance method for drawing a circle of the specified radius
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.fillOval(10, 10, radius, radius);
	}
	
	/**
	 * This method sets the radius of the circle to the specified value 
	 * and repaints the circle to the CirclePanel.
	 * 
	 * @param newRadius 
	 */
	// instance method for verifying new radius and repainting
	public void setRadius(int newRadius)
	{
		// if newRadius is too large or too small, set back to default
		if( (newRadius < 100) || (newRadius > 200) )
			radius = 150;
		else
			radius = newRadius;
		
		//repaint the CirclePanel
		repaint();
	}
	
	/**
	 * This method is used by the layout manager to determine
	 * the preferred size for CirlePanel.
	 */
	// instance method used by the layout manager to get the panel's preferred size
	public Dimension getPreferredSize()
	{
		return new Dimension(200,200);
	}
	
	/**
	 * This method is used by the layout manager to determine
	 * the minimum size for CirclePanel.
	 */
	// instance method used by the layout manager to get the panel's minimum size
	public Dimension getMinimumSize()
	{
		return getPreferredSize();
	}
}
