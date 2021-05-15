package aganitha_oo_design;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X obj1 = new A(1);
		obj1.init("obj1");// Initialize class with object name
		System.out.println(obj1.getClass().getName());//will give class name for object initialized
		Dictionary<Integer, String> d1 = new Hashtable<Integer, String>();
		d1.put(1, "obj1");
		obj1.execute(d1);
		obj1.shutdown();
		
		System.out.println();
		
		X obj2 = new B(2);
		obj2.init("obj2");// Initialize class with object name
		System.out.println(obj2.getClass().getName());//will give class name for object initialized
		Dictionary<Integer, String> d2 = new Hashtable<Integer, String>();
		d2.put(2, "obj2");
		obj2.execute(d2);
		obj2.shutdown();
		
		System.out.println();
		
		X obj3 = new C(3);
		obj3.init("obj3");// Initialize class with object name
		System.out.println(obj3.getClass().getName());//will give class name for object initialized
		Dictionary<Integer, String> d3 = new Hashtable<Integer, String>();
		d3.put(3, "obj3");
		obj3.execute(d3);
		obj3.shutdown();
	}

}
