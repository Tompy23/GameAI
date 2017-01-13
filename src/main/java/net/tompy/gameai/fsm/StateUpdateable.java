package net.tompy.gameai.fsm;

import net.tompy.common.CommonException;

public interface StateUpdateable 
{
	public void update() throws CommonException;
	public void changeState( String newState );	
}
