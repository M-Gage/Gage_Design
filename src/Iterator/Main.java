package Iterator;

/**
 * @author MiaoGuozhu
 * @describtion
 * @date 2019/5/20 13:49
 */
public class Main {
	public static void main(String[] args) {

		//基本上不用了，java已经做得很好了
		//迭代器做到了剑聚合和迭代分开，可以自定义迭代方法，并且利于扩展
		ConcreteAggregate<String> ca = new ConcreteAggregate<String>();
		ca.add("111");
		ca.add("112");
		ca.add("113");
		ca.add("114");
		Iterator<String> i = ca.crateIterator();
		String first = i.first();
		System.out.println(first);

		System.out.println("--------------------");
		while (i.isDone()) {
			String next = i.next();
			System.out.println(next);

		}
		System.out.println("--------------------");
		Iterator<String> pi = ca.crateIterator();
		while (pi.isDone()) {
			String pre = pi.pre();
			System.out.println(pre);
		}

	}
}
