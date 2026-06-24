package example.training.com.abstra;

public class AbstractDemo {
	public static void main(String[] args) {
		Circle c=new Circle();
		c.calculateArea();
		Square s=new Square();
		s.calculateArea();
		c.setColor("pink");
		s.setColor("red");
	
	}

}
