package com.erikleeness.starship.models;

import com.erikleeness.starship.util.CardinalDirection;
import com.erikleeness.starship.util.Speed;

public class ObstacleModel extends ObjectModel
{
	private final ObstacleType obstacleType;
	
	public ObstacleModel(CardinalDirection direction, Speed speed,
			ObstacleType obstacleType)
	{
		super(direction, speed);
		this.obstacleType = obstacleType;
	}
}
