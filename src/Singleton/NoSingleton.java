package Singleton;

/**
 * @author MiaoGuozhu
 * @describtion
 * @date 2019/5/20 17:02
 */
public class NoSingleton {
	private static NoSingleton noSingleton;

	public static NoSingleton getNoSingleton() {
		noSingleton = new NoSingleton();
		return noSingleton;
	}

	public void print() {
		System.out.println(noSingleton);
	}
}
