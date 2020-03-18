package Singleton;

/**
 * @author MiaoGuozhu
 * @describtion Initialization Demand Holder(初始化需求保持器)方式
 * @date 2019/5/20 18:05
 */
public class IoDHSingleton {
	private IoDHSingleton() {
	}

	private static class HolderClass {
		//使用内部类来初始化，这样就可以在需要时调用
		private static final IoDHSingleton ioDHSingleton = new IoDHSingleton();
	}

	public static IoDHSingleton getIoDHSingleton(){
		return HolderClass.ioDHSingleton;
	}
}
