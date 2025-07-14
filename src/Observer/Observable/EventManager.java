package Observer.Observable;
import Observer.Observer.Listener;

public interface EventManager {
	
	void add(Listener listener);
	void remove(Listener listener);
	void notifyListeners();
	void setData(int data);
	String getData();
}
