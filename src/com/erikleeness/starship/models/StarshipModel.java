package com.erikleeness.starship.models;

import com.erikleeness.starship.util.CardinalDirection;
import com.erikleeness.starship.util.Speed;

/**
 * Logical representation of a starship.
 * @author erik
 *
 */
public class StarshipModel extends ObjectModel
{
	private final StarshipType shipType;
	
	public StarshipModel(CardinalDirection direction, Speed speed,
			StarshipType shipClass)
	{
		super(direction, speed);
		this.shipType = shipClass;
	}
	
	
	public StarshipType getShipType()
	{
		return shipType;
	}
	
}
