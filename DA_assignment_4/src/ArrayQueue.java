public class ArrayQueue implements Queue{
	Object[] arr;
	int size;
	int head;
	int tail;
	
	public ArrayQueue() {
		arr = new Object[2];
        size = 0;
        head = 0;
        tail = 0;
	}
	@Override
	public Object dequeue() {
		Object item = arr[head];
        size--;
        head++;
        if (head == arr.length) head = 0; 
        return item;
	}

	@Override
	public void enqueue(Object item) {
		if (size == arr.length) {
			Object[] temp = new Object[size+1];
	        for (int i = 0; i < size; i++) {
	            temp[i] = arr[i];
	        }
	        arr = temp;
		}
        arr[tail] = item;
        tail++;
        if (tail == arr.length) tail = 0;  
        size++;
		
	}

	@Override
	public boolean empty() {
		return size == 0;
	}
	
	public int getSize() {
		return size;
	}
	
	public String getElements() {
		return arr.toString();
	}
}
