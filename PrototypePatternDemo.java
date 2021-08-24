public class PrototypePatternDemo{

	public static void main(String[] args){

		ShapeCache.loadCache();

		// fetching circle object using its id from cache
		Shape clonedShape = (Shape) ShapeCache.getShape("1");
		System.out.println("Shape : " + clonedShape.getType());

		// fetching square object using its id from cache
		Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
		System.out.println("Shape : " + clonedShape2.getType());

		// fetchng rectangle object using its id from cache
		Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
		System.out.println("Shape : " + clonedShape3.getType());
	}
}