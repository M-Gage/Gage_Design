package Iterator;

/**
 * @author MiaoGuozhu
 * @describtion 聚合类
 * @date 2019/5/20 13:57
 */
public interface Aggregate<T> {
	Iterator crateIterator();
	void add(T t);
	void remove(T t);
}
