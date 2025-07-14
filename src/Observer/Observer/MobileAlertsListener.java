package Observer.Observer;

import Observer.Observable.EventManager;

public class MobileAlertsListener extends Listener{
	public MobileAlertsListener(EventManager eventManager)
	{
		super(eventManager);
	}
	
	public void update()
	{
		System.out.println("Mobile Alert, "+ eventManager.getData());
	}
	
}
