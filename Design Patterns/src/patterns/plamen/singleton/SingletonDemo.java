package patterns.plamen.singleton;

public class SingletonDemo {

	public static void main(String[] args){
		
		SingleObject object = SingleObject.getInstance();
		object.show();
	}
	
}
