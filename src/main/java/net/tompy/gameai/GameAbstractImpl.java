package net.tompy.gameai;

import net.tompy.gameai.fsm.StateFactory;


public abstract class GameAbstractImpl implements Game 
{
	protected StateFactory stateFactory = null;
	protected boolean finished = false;

	public void setStateFactory(StateFactory stateFactory) {
		this.stateFactory = stateFactory;
	}

	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}

	public StateFactory getStateFactory() {
		return stateFactory;
	}
	
}
