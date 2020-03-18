package Decorator;

import java.io.Console;

/**
 * @author MiaoGuozhu
 * @describtion 被装饰对象
 * @date 2019/4/22 11:47
 */
public class Person extends ConcreteComponent{
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public void show(){
		System.out.print(name+" 穿了 ");
	}
}
