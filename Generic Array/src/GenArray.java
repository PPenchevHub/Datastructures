
public class GenArray<T> {
	T[] array;
	
	public GenArray(int length){
		array = (T[]) new Object[length];
	}
	
	public void add(int index, T instance){
		
		array[index] = instance;
		
	}
	public T get(int index){
		
		return array[index];
		
	}
}
