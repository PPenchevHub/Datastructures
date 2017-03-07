package patterns.plamen.factory;

public class FactoryDemoPattern {
	public static void main(String[] args){
		ShapeFactory factory = new ShapeFactory();
		
		Shape shape1 = factory.getShape("Circle");
		Shape shape2 = factory.getShape("Square");
		Shape shape3 = factory.getShape("Rectangle");
		shape1.draw();
		shape2.draw();
		shape3.draw();
		
		
	}

}
