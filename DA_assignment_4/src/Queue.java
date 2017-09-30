
public interface Queue {
	
	public Object dequeue();
	public void enqueue(Object item);
	public boolean empty();
	public int getSize();
	public String getElements();
}
