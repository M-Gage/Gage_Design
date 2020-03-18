package Factorys.AbstractFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MiaoGuozhu
 * @describtion 抽象工厂
 * @date 2019/5/8 10:42
 */
public class Main {
	public static void main(String[] args) {
		//这个系统的产品有多于一个的产品族（人类，动物），而系统只消费其中某一族的产品。
		//同属于同一个产品族的产品是在一起使用的，这一约束必须在系统的设计中体现出来(人类)
		//抽象多产品类的共同对象（IBiologicalFactory），提供创建接口
		//抽象共同对象的方法（两个产品族不同对象的相同方法）
		//
		//生物工厂产生人类
		IBiologicalFactory biological = new Human();
		//人类生下来就会吃饭
		IEat eat = biological.createEat();
		//使用吃饭功能
		eat.eat();
		ISleep sleep = biological.createSleep();
		sleep.sleep();
//		IBiologicalFactory biological = new Animal();
//		IEat eat = biological.createEat();
//		eat.eat();
	}
}
