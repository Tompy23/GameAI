package net.tompy.gameai.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameUtil 
{
	public static < T > List< T > shuffle( List< T > items )
	{
		List< T > localItems = new ArrayList< T >();
		Random rand = new Random( System.currentTimeMillis() );
		
		localItems.addAll( items );
		
		List< T > shuffled = new ArrayList< T >();
		while ( ! localItems.isEmpty() )
		{
			int i = rand.nextInt( ( localItems.size() ) );
			shuffled.add( localItems.get( i ) );
			localItems.remove( i );
		}
		
		return shuffled;
	}
}
