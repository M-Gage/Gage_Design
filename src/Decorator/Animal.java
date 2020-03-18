package Decorator;

/**
 *
 * 被装饰的对象实现共同的方法并加上自己的行为
 * @author MiaoGuozhu
 * @describtion 被装饰对象
 * @date 2019/4/22 11:47
 */
public class Animal extends ConcreteComponent{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void show(){
		System.out.print(name+" 不穿裤子和鞋子但是它穿了");
	}
}
