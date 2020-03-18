package Singleton;

/**
 * @author MiaoGuozhu
 * @describtion 饿汉式单例
 * @date 2019/5/20 17:27
 */
public class HungerSingleton {
	//饿汉式一开始就实例化,final
	private final static HungerSingleton hungerSingleton = new HungerSingleton();

	private HungerSingleton (){ }

	public static HungerSingleton getHungerSingleton(){
		return hungerSingleton;
	}

	public void print(){
		System.out.println(hungerSingleton);
	}
}
