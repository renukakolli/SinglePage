package example.training.com.interfac;
interface IVehivle{
	abstract void drive();
	abstract  void turnLeft();
	abstract void brake();
}
interface IPublicTransport{
	abstract void getNumberOfPeople();
}
class MotorisedVehicle{
	void checkMotor(){
		System.out.println("The motor of the vehicle is in good condition");
	}
}

class Car extends MotorisedVehicle{
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("the car is drive mode");
	}

	
	public void turnLeft() {
		// TODO Auto-generated method stub
		System.out.println("the car is left turn");
	}

	
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("the car is break mode");
	}
}
public class Train implements IVehivle,IPublicTransport {

	@Override
	public void getNumberOfPeople() {
		// TODO Auto-generated method stub
		System.out.println("thrre are 6 people");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("the train is drive mode");
	}

	@Override
	public void turnLeft() {
		// TODO Auto-generated method stub
		System.out.println("the train turns left");
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("the train is break mode");
	}
	public static void main(String[] args) {
		Train t=new Train();
		t.turnLeft();
		t.brake();
		t.drive();
		t.getNumberOfPeople();
		System.out.println("-------------------------------");
		Car c=new Car();
		c.checkMotor();
		c.brake();
		c.drive();
		c.turnLeft();
	
	}


}




