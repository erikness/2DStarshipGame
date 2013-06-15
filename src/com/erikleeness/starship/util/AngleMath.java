package com.erikleeness.starship.util;

public class AngleMath
{
	/**
	 * Provides an alternative modulus to the standard Java operator.
	 * This modulus wraps around n2 so that mod(negative, positive) 
	 * is positive.
	 * @param n1
	 * @param n2
	 * @return
	 */
	public static double modulo(double n1, double n2)
	{
		return (n1 % n2 + n2) % n2;
	}
}
