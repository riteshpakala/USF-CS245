
public class ArrayStack implements Stack{
	Object[] arr;
	int size;
	int top;
	
	public ArrayStack() {
		arr = new Object[1];
        size = 0;
        top = -1;
	}
	
	@Override
	public void push(Object item) {
		if(top == arr.length-1) {
			Object[] temp = new Object[arr.length+1];
	        for (int i = 0; i < arr.length; i++) {
	            temp[i] = arr[i];
	        }
	        arr = temp;
		}
		top++;
		arr[top] = item;

        size++;

		
	}

	@Override
	public Object pop() {
		Object item = arr[top];
		size--;
		if (top > 0) {
			top--;
		}
		return item;
	}

	@Override
	public Object peek() {
		return arr[top];
	}

	@Override
	public boolean empty() {
		return size==0;
	}
	
	public int getSize() {
		return size;
	}
	
	public String getElements() {
		return arr.toString();
	}

}
