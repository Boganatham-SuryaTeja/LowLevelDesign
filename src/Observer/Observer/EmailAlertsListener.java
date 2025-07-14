package Observer.Observer;

import Observer.Observable.EventManager;

public class EmailAlertsListener extends Listener{

	public EmailAlertsListener(EventManager eventManager) {
		super(eventManager);
	}

	@Override
	public void update() {
		System.out.println("Email Alert, "+ eventManager.getData());
	}
	
}
