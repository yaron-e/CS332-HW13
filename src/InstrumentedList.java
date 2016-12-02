import java.util.List;

public class InstrumentedList<E> extends ForwardingList<E>{
	private int addCount = 0;	
	public InstrumentedList(List<E> list){ super(list); }
	@Override public boolean add(E e){ addCount++; return super.add(e); }
	public int getAddCount(){ return addCount; }
}