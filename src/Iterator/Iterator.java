package Iterator;

/**
 * @author MiaoGuozhu
 * @describtion 迭代类
 * @date 2019/5/20 13:50
 */
public interface Iterator<T> {
	T first();
	boolean isDone();
	T next();
	T pre();
}
