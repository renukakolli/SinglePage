package example.training.streams.com;
import java.util.*;
import java.util.stream.Collectors;
public class StreamsCollectorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees=EmployeeData.get();
		
		//concat the fn of allemployees
		
		String empFirstnameJoined=employees.stream()
		.map(e-> e.getFirstname())
		.collect(Collectors.joining(","));
		
     System.out.println(empFirstnameJoined);
     
     
     
     //split the list based on salary > 25000.0
    Map<Boolean,Long> empListBySal25k= employees.stream()
     .collect(Collectors.partitioningBy(e-> e.getSalary()>25000.0,Collectors.counting()));
     
     System.out.println(empListBySal25k);
	
	
	//group the emp by their department
	Map<String, List<Employee>> empByDept=employees.stream()
	.collect(Collectors.groupingBy(e-> e.getDepartment()));
	//System.out.println(empByDept);
	
	Map<String, Long> empsByDept=employees.stream()
			.collect(Collectors.groupingBy(e-> e.getDepartment(),Collectors.counting()));
	System.out.println(empsByDept);
	
	//group the emp by their department
	
	
	Map<String, List<String>> empsNamesByDept=employees.stream()
			.collect(Collectors.groupingBy(e-> e.getDepartment(),Collectors.mapping(e-> e.getFirstname(),Collectors.toList())));
	
	System.out.println(empsNamesByDept);
	
	//group the emp by their dep- sum the salaries of emp by each dep
	Map<String, Optional<Double>> sumOfsaldep=employees.stream()
	.collect(Collectors.groupingBy(e-> e.getDepartment(),
			Collectors.mapping(e->e.getSalary(), Collectors.reducing((a,b)-> a+b))));
	//System.out.println(sumOfsaldep);
	
	
	Map<String, Double> sumOfsaldep1=employees.stream()
			.collect(Collectors.groupingBy(e-> e.getDepartment(),
					Collectors.summingDouble(e-> e.getSalary())));
			System.out.println(sumOfsaldep1);
	
			//group the emp by their dep- summary statistics of their salaries
			Map<String, DoubleSummaryStatistics> summary=employees.stream()
			.collect(Collectors.groupingBy(e-> e.getDepartment(),
					Collectors.summarizingDouble(e-> e.getSalary())));
			System.out.println(summary);
			
			
			//
			DoubleSummaryStatistics devsal= employees.stream()
			.collect(Collectors.filtering(e->e.getDepartment().equals("dev"), Collectors.summarizingDouble(e->e.getSalary())));
	
	         System.out.println(devsal);
	
	
	//employee with highest age
	        Optional<Employee>age= employees.stream()
	         .collect(Collectors.maxBy((e1,e2)->e1.getAge()-e2.getAge()));
	         System.out.println(age);
	
	         Optional<Employee>age1= employees.stream()
	    	         .collect(Collectors.maxBy(Comparator.comparing(Employee::getAge)));
	    	         System.out.println(age1);
	    	
	   //name of the emp with highest sal
	    	        String highestsal= employees.stream()
	    	         .collect(Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
	    	        		 empOpt->empOpt.map(e->e.getFirstname()).orElse("name not found")));
	    	         
	    	       System.out.println(highestsal);  
	    	         
	
	
	
	
	}
}
