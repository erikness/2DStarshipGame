package com.erikleeness.starship;

/**
 * Implemented by classes that have a logical method
 * to update after a periodic time delay.
 * @author erik
 *
 */
public interface Updatable
{
	public void update(int msDelay);
}
