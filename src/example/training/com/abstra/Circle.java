package example.training.com.abstra;

public class Circle extends Shape {

	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		int r=5;
		double area=3.14*r*r;
		System.out.println(area);
		return area;
	}

}
