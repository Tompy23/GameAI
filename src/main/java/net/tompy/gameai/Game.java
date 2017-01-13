package net.tompy.gameai;

import net.tompy.gameai.fsm.StateFactory;
import net.tompy.gameai.fsm.StateUpdateable;

public interface Game extends StateUpdateable
{
	public boolean isFinished();
	public StateFactory getStateFactory();
}
