package com.erikleeness.starship.models;

import com.erikleeness.starship.util.CardinalDirection;
import com.erikleeness.starship.util.Speed;

public abstract class ObjectModel
{

	protected CardinalDirection direction;
	/** In pixels per second */
	protected Speed speed;
	
	public ObjectModel(CardinalDirection direction, Speed speed)
	{
		this.direction = direction;
		this.speed = speed;
	}
	
	public void setDirection(CardinalDirection direction)
	{
		this.direction = direction;
	}
	
	/**
	 * Set the speed of this object
	 * @param speed
	 */
	public void setSpeed(Speed speed)
	{
		this.speed = speed;
	}
}
