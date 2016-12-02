import java.util.*;

public class quiz11 {
	
	Integer          i = 42;
	Number           num = 3.14;
	Object[]         objects;
	List             list0;
	List < Number >  list1;
	
	public void addToObjectsArray(){
		objects = new Number[3];             // 1 OK
		objects[1] = i;                      // 2 OK
		objects[2] = "cat";                  // 3 RE
	}
	
	public void addToRawList(){

		list0 = new ArrayList();             // 4 CW
		list0.add("cat") ;                   // 5 CW
		list0.add(5);
	}
	
	public void addToList(){

		list1 = new ArrayList < Number >();  // 6 OK
		list1.add(i) ;                       // 7 OK
		list1.add(num) ;                     // 8 OK
	}
	
	public void addToList(Number n){

		list1 = new ArrayList < Number >();  // 6 OK
		list1.add(n) ;                       // 7 OK
	}
	
	public void addToList(Object n){

		list1 = new ArrayList < Number >();  // 6 OK
		list1.add((Number) n) ;              // 7 OK
	}
}
