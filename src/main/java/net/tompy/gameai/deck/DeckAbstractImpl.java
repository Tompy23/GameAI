package net.tompy.gameai.deck;

import java.util.ArrayList;
import java.util.List;

import net.tompy.gameai.util.GameUtil;

public abstract class DeckAbstractImpl< T > implements Deck< T > 
{
	protected List< T > cards = new ArrayList< T >();
	
	public void reset()
	{
		cards.clear();
	}
	
	public void addList( List< T > newCards )
	{
		cards.addAll( newCards );
	}
	
	public void add( T card )
	{
		cards.add( card );
	}
	
	public void addBottom( T card )
	{
		cards.add( cards.size(), card );
	}
	
	public T get()
	{
		return get( 0 );
	}
	
	public T getBottom()
	{
		return get( cards.size() - 1 );
	}
	
	public T get( int index )
	{		
		T returnValue = null;
		
		if ( ! cards.isEmpty() && cards.size() > index )
		{
			returnValue = cards.get( index );
			cards.remove( index );
		}
		
		return returnValue;
	}
	
	public void shuffle()
	{
		cards = GameUtil.shuffle( cards );
	}
	
	public List< T > getAll()
	{
		return cards;
	}
}