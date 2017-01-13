package net.tompy.gameai.fsm;

public class StateAbstractImpl< T > implements State< T > 
{
	protected StateFactory factory = null;
	
	@Override
	public void execute(T me) 
	{
	}

	@Override
	public void enter(T me) 
	{
	}

	@Override
	public void exit(T me) 
	{
	}

	public void setFactory(StateFactory factory) {
		this.factory = factory;
	}

}
