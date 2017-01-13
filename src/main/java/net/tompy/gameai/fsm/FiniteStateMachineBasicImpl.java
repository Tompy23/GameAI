package net.tompy.gameai.fsm;

public class FiniteStateMachineBasicImpl< T >  implements FiniteStateMachine< T > 
{
	private T owner;
	private State< T > currentState = null;
	private State< T > previousState = null;
	private State< T > globalState = null;
	
	@Override
	public void update() 
	{
		if ( null != currentState )
		{
			currentState.execute( owner );
		}
	}
	
	@Override
	public void changeState(State<T> newState) 
	{
		if ( null != currentState )
		{
			currentState.exit( owner );
		}
		previousState = currentState;
		currentState = newState;
		if ( null != currentState )
		{
			currentState.enter( owner );
		}
	}
	
	@Override
	public void revertToPreviousState() 
	{
		currentState = previousState;
	}
	
	@Override
	public State<T> getGlobalState() 
	{
		return globalState;
	}
	
	@Override
	public void setGlobalState(State<T> globalState) {
		this.globalState = globalState;
	}
	
	@Override
	public boolean isInState(State<T> testState) 
	{
		return testState == currentState;
	}
	
	@Override
	public void setOwner(T owner) {
		this.owner = owner;
	}
	public void setCurrentState(State<T> currentState) {
		this.currentState = currentState;
	}
	public void setPreviousState(State<T> previousState) {
		this.previousState = previousState;
	}
}
