package net.tompy.gameai.fsm;

public interface State< T >
{
	public void execute( T me );
	public void enter( T me );
	public void exit( T me );
}
