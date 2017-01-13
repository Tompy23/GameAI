package net.tompy.gameai.fsm;

public interface FiniteStateMachine< T >
{
	public void update();
	public void changeState( State< T > newState );
	public void revertToPreviousState();
	public State< T > getGlobalState();
	public void setGlobalState( State< T > state );
	public boolean isInState( State< T > testState );
	public void setOwner( T owner );
}
