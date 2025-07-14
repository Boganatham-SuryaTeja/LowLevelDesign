package Observer;

import Observer.Observable.StockEventManager;
import Observer.Observer.EmailAlertsListener;
import Observer.Observer.MobileAlertsListener;

public class Main {
	public static void main(String[] args)
	{
		StockEventManager stockEventManager = new StockEventManager();
		EmailAlertsListener email = new EmailAlertsListener(stockEventManager);
		MobileAlertsListener mobile = new MobileAlertsListener(stockEventManager);
		
		stockEventManager.add(mobile);
		stockEventManager.add(email);
		stockEventManager.setData(10);
		stockEventManager.setData(0);
		stockEventManager.setData(100);
	}
}
