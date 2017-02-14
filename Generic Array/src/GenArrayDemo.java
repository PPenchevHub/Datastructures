
public class GenArrayDemo {
	
	public static void main(String[] args){
		GenArray<String>array = new GenArray<>(5);
		
		array.add(0, "first");
		array.add(1, "second");
		array.add(2, "third");
		
		System.out.println(array.get(1));
		
	}

}
