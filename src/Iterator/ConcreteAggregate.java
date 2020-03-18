package Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MiaoGuozhu
 * @describtion 具体聚合类
 * @date 2019/5/20 13:58
 */
public class ConcreteAggregate<T> implements Aggregate<T> {
	private List<Object> items = new ArrayList<>();

	@Override
	public Iterator<T> crateIterator() {
		return new IteratorImpl(this);
	}

	@Override
	public void add(T o) {
		items.add(o);	}

	@Override
	public void remove(T o) {
		items.remove(o);
	}

	public List<Object> getObjects() {
		return items;
	}
}
