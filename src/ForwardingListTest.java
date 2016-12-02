import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

public class ForwardingListTest {

	@Test
	public void test() {
		List<String> r = new ArrayList<String>();  
		InstrumentedList<String> s = new InstrumentedList<String>(r);
		InstrumentedList<String> t = new InstrumentedList<String>(s);
		
		s.add("cat");
		t.add("dog"); 
		s.add("mouse");
		r.remove("dog");
		
		assertEquals(s.toString(), t.toString());
		assertEquals(t.toString(), r.toString());
		assertEquals(r.toString(), s.toString());
		assertEquals("[cat, mouse]", s.toString());
	}
	
	@Test
	public void test2() {
		List<String> r = new ArrayList<String>();  
		InstrumentedList<String> s = new InstrumentedList<String>(r);
		InstrumentedList<String> t = new InstrumentedList<String>(s);

		s.add("cat");
		t.add("dog"); 
		s.add("mouse");
		r.remove("dog");
		
		
		assertEquals(3, s.getAddCount());
	}
	
	@Test
	public void test3() {
		List<String> r = new ArrayList<String>();  
		InstrumentedList<String> s = new InstrumentedList<String>(r);
		InstrumentedList<String> t = new InstrumentedList<String>(s);

		s.add("cat");
		t.add("dog"); 
		s.add("mouse");
		r.remove("dog");
		
		
		assertEquals(1, t.getAddCount());
	}
	
	@Test//(expected=(ArrayStoreException.class))
	public void test4() {
		quiz11 q = new quiz11();
		
		q.addToObjectsArray();
	}
	
	
	@Test
	public void test5() {
		quiz11 q = new quiz11();
		
		q.addToRawList();
	}
	
	@Test
	public void test6() {
		quiz11 q = new quiz11();
		
		q.addToList();
	}
}
