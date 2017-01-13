package net.tompy.gameai;

import net.tompy.gameai.fsm.StateFactory;
import net.tompy.gameai.fsm.StateUpdateable;

public interface Player extends StateUpdateable
{
	public String getName();
	public int getId();
	public StateFactory getStateFactory();
	
	public void takeTurn();
	public void playCard();
	
	public String display();
}
