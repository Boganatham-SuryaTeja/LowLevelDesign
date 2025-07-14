package Observer.Observable;

import java.util.*;
import Observer.Observer.Listener;

public class StockEventManager implements EventManager{
	private List<Listener> listeners = new ArrayList<>();
	private int stockCount = 0;
	
	@Override
	public void add(Listener listener) {
		if(!listeners.contains(listener))
		{
			listeners.add(listener);
		}
		
	}

	@Override
	public void remove(Listener listener) {
		if(listeners.contains(listener))
		{
			listeners.remove(listener);
		}
	}

	@Override
	public void notifyListeners() {
		for(Listener listener : listeners)
		{
			listener.update();
		}
	}
	
	
	@Override
	public void setData(int stockCount) {
		int prevStockCount = this.stockCount;
		
		this.stockCount = stockCount;
		
		if(prevStockCount == 0)
		{
			notifyListeners();
		}
	}
	
	public String getData()
	{
		return "Stocks Update: " + stockCount;
	}
	

}
