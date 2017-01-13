package net.tompy.gameai.fsm;

import java.util.HashMap;
import java.util.Map;

public class StateFactory 
{
    private Map< String, State< ? > > stateMap = new HashMap< String, State< ? > >();

	public State< ? > createState( String stateName )
	{
		return stateMap.get( stateName );
	}

	public void setStateMap(Map<String, State<?>> stateMap) {
		this.stateMap = stateMap;
	}
}
