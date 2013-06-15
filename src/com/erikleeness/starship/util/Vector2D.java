package com.erikleeness.starship.util;

import java.awt.Dimension;

public class Vector2D
{
	public double x;
	public double y;
	
	public Vector2D(double x, double y)
	{
		this.x = x;
		this.y = y;
	}

	public boolean inBounds(int xmin, int ymin, int xmax, int ymax)
	{
		return x >= xmin && x <= xmax && y >= ymin && y <= ymax;
	}

	public boolean isFinite()
	{
		return !(Double.isInfinite(x) || Double.isInfinite(y) || Double.isNaN(x) || Double.isNaN(y));
	}

	public String toString()
	{
		return "(" + x + "," + y + ")";
	}
	
	/**
	 * Converts, with a loss of precision (truncated toward zero), to a Dimension.
	 * 
	 * Examples:
	 * 
	 * Vector2D(14.6, 700.4) => Dimension(14, 700)
	 * Vector2D(-0.4,  4.99) => Dimension(0, 4);
	 * 
	 * @return 		a Dimension with the truncated values
	 */
	public Dimension toDimension()
	{
		return new Dimension( (int) x, (int) y );
	}
}