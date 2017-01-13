package net.tompy.gameai.fsm;

import net.tompy.gameai.fsm.FSMCreator;
import net.tompy.gameai.fsm.FiniteStateMachine;
import net.tompy.gameai.fsm.FiniteStateMachineBasicImpl;

public class FSMCreatorGameImpl< T > implements FSMCreator< T > 
{
	@Override
	public FiniteStateMachine< T > create( T owner ) 
	{
		FiniteStateMachine< T > returnValue = new FiniteStateMachineBasicImpl< T >();
		
		returnValue.setOwner( owner );
		
		return returnValue;
	}

}
