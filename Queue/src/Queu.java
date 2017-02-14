
public class Queu<T> {

	private Node<T> start;
	private int size = 0;

	public T dequeu() {
		if (start == null) {
			return null;
		}

		Node<T> result = start;
		start = result.next;
		return result.value;
	}

	public String toString() {
		StringBuffer res = new StringBuffer("[");
		Node<T> current = start;
		while (current != null) {
			res.append(current.value + " ");
			current = current.next;

		}
		return res.toString().trim() + "]";
	}


	public int getSize(){
		return size;
	}
	
	public T enqueu(T value){
		
		if(start == null){
			start =  new Node<>();
			start.value =  value;
			size++;
			return value;
		}
		if(start != null){
			Node<T> current =  start, last = start;
			while(current != null){
				last = current;
				current =  current.next;
				
			}
			current = new Node<>();
			current.value = value;
			last.next = current;
			size++;
			return value;
		}
		return null;
		
		
	}
}




































//
//public T enqueu(T obj) {
//	
//	if (start == null) {
//		start = new Node<>();
//		start.value = obj;
//		size++;
//		System.out.println("first Note created + " + start.value);
//		return obj;
//		
//	} else if (start != null) {
//		
//		Node<T> current = start, last = start;;
//		while(current != null){
//			last = current;
//			current = current.next;
//			
//		}
//		current = new Node<>();
//		current.value = obj;
//		last.next = current;
//		size++;
//		return obj;
//	}
//
//	return obj;
//}
