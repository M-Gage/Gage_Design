package Bridge;

/**
 * @author MiaoGuozhu
 * @describtion 手机品牌类（抽象类)
 * Abstraction（抽象类）：用于定义抽象类的接口，它一般是抽象类而不是接口，其中定义了一个Implementor（实现类接口）类型的对象并可以维护该对象，
 * 它与Implementor之间具有关联关系(这就是那座桥)，它既可以包含抽象业务方法，也可以包含具体业务方法
 * 可以称之为桥头
 * @date 2019/5/17 15:30
 */
public abstract class PhoneBrand {
	//这里不要用私有方法
	public Soft soft;

	public void setSoft(Soft soft) {
		this.soft = soft;
	}

	abstract void run();
}
