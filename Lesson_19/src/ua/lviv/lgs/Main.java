package ua.lviv.lgs;

import java.io.File;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Iterator;





public class Main {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Employee employee = new Employee("Names1", 35, 35.5);
		File file = new File("File_Seri_Obj.txt");
		Methods.serialize(file,employee);
		System.out.println(Methods.deserealize(file));
		System.out.println();
		System.out.println("Out_Collection");
		System.out.println();
		
		File fileCollection = new File("File_Seri_Collec.txt");
		ArrayList<Employee> employeeCollection = new ArrayList<Employee>();
		String Str_name = "Names";
		
	for (int i=0;i<10;i++) {	
		
		double random_salary = Math.round((Math.random()* (100 - 1) + 2) * 100d) / 100d;
		int random_id = (int) (Math.random()* (100 - 1) + 2);
		employeeCollection.add(new Employee(Str_name+(i+2),random_id, random_salary));
	}
		
		Iterator<Employee> iterator = employeeCollection.iterator();
		while (iterator.hasNext()) {
			Employee next = (Employee) iterator.next();
			Methods.serialize(fileCollection,next);
			System.out.println(Methods.deserealize(fileCollection));
		}
		
		
		
	}
	

}
