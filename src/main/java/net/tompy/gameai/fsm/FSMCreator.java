package net.tompy.gameai.fsm;


public interface FSMCreator< T > 
{
	public FiniteStateMachine< T > create( T owner );
}
