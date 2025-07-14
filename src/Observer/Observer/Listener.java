package Observer.Observer;

import Observer.Observable.EventManager;

public abstract class Listener {
	EventManager eventManager;
	
	public Listener(EventManager eventManager)
	{
		this.eventManager = eventManager;
	}
	
	public abstract void update();
}
