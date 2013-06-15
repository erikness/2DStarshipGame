package com.erikleeness.starship.models;

import com.erikleeness.starship.util.CardinalDirection;
import com.erikleeness.starship.util.Speed;

public class WeaponBlastModel extends ObjectModel
{
	private final WeaponBlastType weaponBlastType;
	
	public WeaponBlastModel(CardinalDirection direction, Speed speed,
			WeaponBlastType weaponBlastType)
	{
		super(direction, speed);
		this.weaponBlastType = weaponBlastType;
	}

}
