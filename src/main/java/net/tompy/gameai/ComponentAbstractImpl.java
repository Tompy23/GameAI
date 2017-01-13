package net.tompy.gameai;

import net.tompy.common.CommonConstants;

public class ComponentAbstractImpl implements Component 
{
	protected String name;
	protected int id;
	
	@Override
	public String display()
	{
		return id + ": " + name + CommonConstants.LINE_END;
	}
	
	@Override
	public String getName() 
	{
		return name;
	}

	@Override
	public int getId() 
	{
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

}
