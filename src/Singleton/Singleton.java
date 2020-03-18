package Singleton;

/**
 * @author MiaoGuozhu
 * @describtion 普通的单例
 * @date 2019/5/20 16:40
 */
public class Singleton {
	private static Singleton singleton;

	//阻止new外部创建对象
	private Singleton() {
	}

	//没有锁，并发依旧可能创建多个
	public static Singleton getSingleton() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}

	public void print() {
		System.out.println(singleton);
	}
}
