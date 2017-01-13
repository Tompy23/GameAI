package net.tompy.gameai;

import net.tompy.gameai.fsm.StateFactory;

public abstract class PlayerAbstractImpl implements Player
{
	protected int id;
	protected String name;

	protected StateFactory stateFactory = null;

	@Override
	public void takeTurn()
	{
		// No op
	}
	
	@Override
	public void playCard()
	{
		// No op
	}
	
	@Override
	public String getName() 
	{
		return name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public StateFactory getStateFactory() {
		return stateFactory;
	}

	public void setStateFactory(StateFactory stateFactory) {
		this.stateFactory = stateFactory;
	}
}

