package com.erikleeness.starship.util;

public class Speed
{
	private double speedInPixels;
	
	/**
	 * Use a factory method, fool!
	 * @param speedInPixels
	 */
	private Speed(double speedInPixels)
	{
		this.speedInPixels = speedInPixels;
	}
	
	/* Factories */
	
	public static Speed inPixels(double speedInPixels)
	{
		return new Speed(speedInPixels);
	}
	
	/* Accessors */
	
	public double getSpeedInPixels()
	{
		return speedInPixels;
	}
}
