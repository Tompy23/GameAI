package net.tompy.gameai;

import java.util.Properties;

import net.tompy.common.CommonConstants;
import net.tompy.common.CommonException;
import net.tompy.common.CommonProcess;

import org.springframework.context.ApplicationContext;

public class ProcessGameImpl implements CommonProcess
{
	private Game myGame;
	
	@Override
	public int process( ApplicationContext ctx, Properties properties ) 
	{
		int returnValue = CommonConstants.RETURN_SUCCESS;

		try
		{
			while( ! myGame.isFinished() )
			{
				myGame.update();
			}
		}
		catch ( CommonException ce )
		{
			ce.print();
			returnValue = ce.getStatus();
		}
		
		return returnValue;
	}

	public void setMyGame(Game myGame) {
		this.myGame = myGame;
	}
}
