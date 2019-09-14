package replaceInheritanceWithDelegation;

import java.util.Vector;

public class Stack extends Vector<Object> {
	private Vector<Object> vector;
	
	public Stack() {
		this.vector = new Vector(100);
	}

	public void push(Object element) {
		this.vector.insertElementAt(element, 0);
	}

	public Object pop() {
		Object result = this.vector.firstElement();
		this.vector.removeElementAt(0);
		return result;
	}
	@Override
	public boolean isEmpty() {
		return this.vector.isEmpty();
	}
}
