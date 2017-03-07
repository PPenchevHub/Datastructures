package patterns.plamen.strategy;

public class Client {
	public static void main(String[] args){
		
		CompressionContext ctx = new CompressionContext();
		ctx.setCompressionStrategy(new ZipCompressionStrategy());
		ctx.createArchive(null);
		
	}

}
