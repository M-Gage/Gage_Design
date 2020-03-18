package Factorys.AbstractFactory;

/**
 * @author MiaoGuozhu
 * @describtion
 * @date 2019/5/8 11:24
 */
public interface IBiologicalFactory {
	IEat createEat();
	ISleep createSleep();
}
