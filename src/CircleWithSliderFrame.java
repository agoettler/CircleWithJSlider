
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
import javax.swing.SwingConstants;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;


public class CircleWithSliderFrame extends JFrame
{
	private static final long serialVersionUID = 4942319650924574564L;
	private CirclePanel circlePane;
	private CircleDataPanel dataPane;
	private JSlider radiusSlider;
	
	/**
	 * This no-argument constructor instantiates a new CircleWithSliderFrame object.
	 */
	// constructor
	public CircleWithSliderFrame()
	{
		super("Circler With Slider"); // call the superclass constructor first
		
		circlePanelCreator();
		circleDataPanelCreator();
		radiusSliderCreator();
	}
	
	/**
	 * This inner helper method assists the constructor in 
	 * instantiating the CirclePanel instance object.
	 */
	// inner helper method for setting up the CirclePanel
	private void circlePanelCreator()
	{
		this.circlePane = new CirclePanel();
		this.circlePane.setBackground(Color.WHITE);
		
		// since the circle is the focus of the window, add it to the center of the frame
		this.add(circlePane, BorderLayout.CENTER);
	}
	
	/**
	 * This inner helper method assists the constructor in
	 * instantiating the CircleDataPanel instance object.
	 */
	// inner helper method for setting up the CircleDataPanel
	private void circleDataPanelCreator()
	{
		this.dataPane = new CircleDataPanel(circlePane.getRadius());
		
		// for organization, the slider will be in the CircleDataPanel
		// so it should have a grid layout
		dataPane.setLayout(new GridLayout(1,2));
		
		// add the CircleDataPanel to the bottom of the frame
		this.add(dataPane, BorderLayout.SOUTH);
	}
	
	/**
	 * This inner helper method assists the constructor in
	 * instantiating the JSlider instance object.
	 */
	// inner helper method for setting up the JSlider
	private void radiusSliderCreator()
	{
		this.radiusSlider = new JSlider(SwingConstants.HORIZONTAL, 100, 200, 150);
		this.radiusSlider.setMajorTickSpacing(5);
		this.radiusSlider.setPaintTicks(true);
		
		// register an event listener for the slider
		radiusSlider.addChangeListener
		(
				// anonymous inner class for event listener
				new ChangeListener() 
				{
					// event handler for changes in slider value
					public void stateChanged(ChangeEvent sliderEvent)
					{
						// propagate the changes to the circlePanel and the dataPanel
						circlePane.setRadius(radiusSlider.getValue());
						dataPane.updateData(circlePane.getRadius());
					}
				}
		);
		
		// add the slider to the CircleDataPanel
		dataPane.add(radiusSlider);
	}
}
