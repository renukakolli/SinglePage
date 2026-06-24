package example.training.streams.com;
import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeData {
	public static ArrayList<Employee> get(){
		return new ArrayList<Employee>(Arrays.asList(
				new Employee(1,"main","neelapu","dev","se",24000.00,30),
				new Employee(2,"raju","mudunuri","dev","se",25000.00,40),
				new Employee(3,"anad","nela","admin","vp",25000.00,35),
				new Employee(4,"swathi","muduri","hr","se",44000.00,24),
				new Employee(5,"murthy","gdn","dev","dba",23000.00,40),
				new Employee(6,"murthy","gsn","dev","devops",24000.00,30)
				
				));
	}

}
