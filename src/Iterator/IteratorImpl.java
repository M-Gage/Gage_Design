package Iterator;

import java.util.List;

/**
 * @author MiaoGuozhu
 * @describtion 具体迭代类
 * @date 2019/5/20 13:52
 */
public class IteratorImpl<T> implements Iterator<T> {
	private List<T> items;
	int reverse;
	int positive;

	public IteratorImpl(ConcreteAggregate aggregate) {
		items = aggregate.getObjects();
		positive = 0;
		reverse = items.size() - 1;
	}

	@Override
	public T first() {
		return items.get(0);
	}

	@Override
	public boolean isDone() {
		return reverse >= positive;
	}

	@Override
	public T next() {
		T t = items.get(positive);
		positive++;
		return t;
	}

	@Override
	public T pre() {
		T t = items.get(reverse);
		reverse--;
		return t;
	}

}
