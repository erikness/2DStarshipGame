package com.erikleeness.starship.util;

/**
 * Immutable
 * @author erik
 *
 */
public class CardinalDirection
{
	private double angle;
	
	public static CardinalDirection NORTH = new CardinalDirection(90.0);
	public static CardinalDirection EAST = new CardinalDirection(180.0);
	public static CardinalDirection SOUTH = new CardinalDirection(270.0);
	public static CardinalDirection WEST = new CardinalDirection(0.0);
	

	public CardinalDirection(double angle)
	{
		this.angle = AngleMath.modulo(angle, 360.0);
	}
	
	public double getAngle()
	{
		return angle;
	}
}
