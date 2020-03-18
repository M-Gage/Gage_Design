package Singleton;

/**
 * @author MiaoGuozhu
 * @describtion 懒汉式单例
 * @date 2019/5/20 16:47
 */
public class LazySingleton {
	private static LazySingleton lazySingleton;

	private LazySingleton() {
	}

	//方法上可以加锁，但是每次访问方法都锁住方法，降低性能
	public synchronized static LazySingleton getLazySingleton() {
		//双重判断
		//第一次判断
		if (lazySingleton == null) {
			//只有同时进的进程才触发锁，性能提高
			synchronized (LazySingleton.class) {//同步（锁定）代码块
				//第二次判断
				if (lazySingleton == null) {
					//需要时再初始化
					return lazySingleton = new LazySingleton();
				}
			}
		}
		return lazySingleton;
	}

	public void print() {
		System.out.println(lazySingleton);
	}
}
