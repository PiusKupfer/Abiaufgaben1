package aufgabe3;

public class Queue {
	int current = 0;
	
	public static void main(String[]args) {
	
	}	
		public void enqueue(Object d) {
		LinkedList l = new LinkedList(d,null);
			if(first == null) {
				first = n;
			}else{
				LinkedList l = first;
				while (l.getNext() != null) {
					l = l.getNext();
				}
		}
		l.setNext(d);
	}
	
}
