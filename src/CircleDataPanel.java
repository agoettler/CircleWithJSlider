
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
import javax.swing.JTextArea;


public class CircleDataPanel extends JPanel
{
	private static final long serialVersionUID = -1554494829530636257L;
	private JTextArea dataTextArea;
	private CircleData circleCalc;
	
	/**
	 * This constructor creates the CircleDataPanel and initializes the
	 * data displayed using the initial radius.
	 * 
	 * @param radius the initial radius of the circle
	 */
	// constructor takes an initial radius as an argument
	public CircleDataPanel(int radius)
	{
		super();
		
		//create a new empty JTextArea object with 4 rows and 20 columns
		dataTextArea = new JTextArea("", 4, 20);
		
		// create a new CircleData object to do the attribute calculations
		circleCalc = new CircleData();
		
		// make the JTextArea uneditable
		dataTextArea.setEditable(false);
		
		// set the TextArea values using the initial radius
		updateData(radius);
		
		// add the JTextArea to the JPanel
		this.add(dataTextArea);
	}
	
	/**
	 * This method is used to update the data displayed in the CircleDataPanel
	 * whenever the circle is redrawn.
	 * 
	 * @param radius current radius of the circle
	 */
	public void updateData(int radius)
	{
		dataTextArea.setText(String.format("radius = %d\n" 
				+ "diameter = %d\n" + "area = %d\n" + "circumference = %d\n", 
				radius, circleCalc.getDiameter(radius), circleCalc.getArea(radius),
				circleCalc.getCircumference(radius)));
	}
}
