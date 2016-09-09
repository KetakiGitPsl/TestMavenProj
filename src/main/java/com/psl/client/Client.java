package com.psl.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.aop.Performer;
import com.psl.service.EmployeeService;

public class Client {
	
	private static EmployeeService service;
	
	public EmployeeService getService() {
		return service;
	}

	public void setService(EmployeeService service) {
		this.service = service;
	}

	public static void main(String[] args) throws Exception {
		
		//Spring container initialization
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("config.xml");
		
		//get beans 
	//	Employee e = (Employee)context.getBean("emp");
	/*	Address a  = (Address) context.getBean("addr");
		a.setCity("Nagpur");
		e.setAddr(a);*/
		
		//invoking business logic
	//	System.out.println(e.toString());
		//context.registerShutdownHook();
		
		//System.out.println("In client add employee flow");
		// service.addEmployee(e);
		
		/*System.out.println("In get Employees");
		List<Employee> list = service.getAllEmployees();
		
		for (Employee employee : list) {
			System.out.println("~" + employee.getId() + " ~ " + employee.getName()) ;
		}*/
		
		/*Iterator<Employee> it= list.iterator();
		while(it.hasNext()){
			Employee e1 = (Employee) it.next();
			System.out.println("~" + e1.getId() + " ~ " + e1.getName()) ;
			
		}*/
		
		Performer p = (Performer) context.getBean("performer");
		p.perform();// primary concern
		
	System.out.println("Done");
//		System.out.println("Done retrieving employees");
		
		
		
	}
	

}
