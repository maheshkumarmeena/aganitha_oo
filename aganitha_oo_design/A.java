package aganitha_oo_design;

import java.util.Dictionary;

public class A extends X{
	int id;
	String name;
	final String class_name = "A";
	A(int i){
		id=i;
	}
	void init(String n) {
		name = n;
		System.out.println("Initializing Object name: "+name);
		System.out.println("Initializing Class name: "+class_name);
	}
	
	@SuppressWarnings("rawtypes")
	void execute(Dictionary dict)
	{
		System.out.println("Executing Object id: "+id);
		System.out.println("Executing Object is: "+dict.get(id));
		System.out.println("Executing Object class: "+class_name);
	}
	
	void shutdown()
	{
		System.out.println("Shutting down Object: "+name);
		System.out.println("Shutting down Object Class: "+class_name);
	}
	
}
