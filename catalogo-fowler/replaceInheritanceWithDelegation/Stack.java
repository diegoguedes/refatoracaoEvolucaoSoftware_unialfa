package replaceInheritanceWithDelegation;

import java.util.Vector;

public class Stack extends Vector<Object> {
	private Vector<Object> vector;

	public void push(Object element) {
		vector.insertElementAt(element, 0);
	}

	public Object pop() {
		Object result = vector.firstElement();
		vector.removeElementAt(0);
		return result;
	}
}
