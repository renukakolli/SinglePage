package example.training.streams.com;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		List<Employee> employees=EmployeeData.get();
	
		//print list of all employee
		/*employees.stream()
		         .forEach(e->System.out.println(e));*/
		
		
		//salary > 20k and lastname start with "m
       /* employees.stream()
        .filter(e-> e.getSalary() > 20000.00)
        .filter(e->e.getLastname().startsWith("m"))
        .forEach(e->System.out.println(e));*/
		
		//sort by first name
		
//		employees.stream()
//		.sorted((e1, e2)-> e1.getFirstname().compareTo(e2.getFirstname()))
//		.forEach(e-> System.out.println(e));
		
		
		//only firstnames in sorted order
		
//		employees.stream()
//		.map(e->e.getFirstname())
//		.distinct()
//		.sorted()
//		.forEach(e-> System.out.println(e));
		
	//count of employee in dev department
		/*System.out.println(
		employees.stream()
		.filter(e-> e.getDepartment().equals("dev"))
		.count());*/
		
		//sum of sal of all employee in dev dep
		/*System.out.println(
				employees.stream()
				.filter(e-> e.getDepartment().equals("dev"))
				.mapToDouble(e-> e.getSalary())
				//.reduce(0.0, (e,c)-> e+c)
				.sum()
				);*/
		
		//max sal of the employee
		/*System.out.println(
				employees.stream()
				.mapToDouble(e-> e.getSalary())
				//.reduce(0.0, (e,c)-> e+c)
				.max()
				);*/
		//List of employee first names
		
		
		/*List<String> emp=employees.stream()
		.map(e->e.getFirstname())
		.distinct()
		//.toList();
		.collect(Collectors.toList());
		System.out.println(emp);*/
		
		//immutable list of names
		/*List<String> emp=employees.stream()
				.map(e->e.getFirstname())
				.distinct()
				//.toList();
				.collect(Collectors.toUnmodifiableList());
		emp.add("renu");
				System.out.println(emp);*/
		
		//map of employee data with name as key and salary as value
		Map<String, Double> emp=employees.stream()
		.collect(Collectors.toMap(e->e.getFirstname(), e-> e.getSalary(),
				(a,b)-> a
				));
		System.out.println(emp);
		
		
				
		
		
	}

}
