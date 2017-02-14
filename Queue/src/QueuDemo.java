
public class QueuDemo {
	
	public static void main(String[] args){
		Queu<String> que =  new Queu<>();
		que.enqueu("first");

		que.enqueu("second");
		
		que.enqueu("third");
		que.enqueu("forth");
		que.dequeu();
		System.out.println(que.toString());

		System.out.println(que.getSize());
		
		
	}

}
