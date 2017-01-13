package net.tompy.gameai.deck;

import java.util.List;


public interface Deck< T >
{
	public void reset();
	public void addList( List< T > cards );
	public void add( T card );
	public void addBottom( T card );
	public T get();
	public T getBottom();
	public T get( int index );
	public void shuffle();
	public List< T > getAll();
}
