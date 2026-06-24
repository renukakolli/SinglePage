package example.training.com.abstra;

public class Square extends Shape {

	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		double l = 4.0,b=4.0;
		double area=l*b;
		System.out.println(area);
		return area;
	}

}
