package Decorator;

/**
 * @author MiaoGuozhu
 * @describtion 装饰者模式
 * @date 2019/4/22 11:36
 */
public class Main {

	public static void main(String[] args) {

		//先抽象出一个行为show(可以理解为穿)定义成接口DecoratorComponent(可以抽象类）
		//EX:中间类ConcreteComponent，继承它可以设置更多具体对象
		//Person具体被装饰对象（可以扩展功能）
		//装饰类Decorator继承Person(或中间类) 初始化的时候依赖接口DecoratorComponent并引用show方法
		//装饰品类继承Decorator实现（超类）show方法
		//以下为装饰过程
		//先创建被装饰对象Person
		//后创建装饰品来装饰装饰对象
		//再后面的装饰品就装饰前一个装饰品对象
		//最后最后一个装饰品对象调用行为show
		Person person = new Person("满");
		DecoratorBriefs db = new DecoratorBriefs();
		DecoratorPants dp = new DecoratorPants();
		DecoratorTShirt dt = new DecoratorTShirt();
		DecoratorShoe ds = new DecoratorShoe();
		db.setDecoration("性感红内裤");
		db.decorator(person);
		db.show();
		System.out.println();
		dp.setDecoration("紧身裤");
		dp.decorator(db);
		dt.setDecoration("骚粉T恤");
		dt.decorator(dp);
		dt.show();
		System.out.println();
		ds.setDecoration("高跟鞋");
		ds.decorator(dp);
		ds.show();
		System.out.println();
		ds.decorator(dt);
		ds.show();
		System.out.println();

		//EX
		Animal a = new Animal();
		a.setName("博美");
		db.setDecoration("尿不湿");
		db.decorator(a);
		db.show();
		System.out.println();
		dp.setDecoration("");
		dp.decorator(db);
		ds.setDecoration("");
		ds.decorator(dp);
		dt.setDecoration("小黄人外套");
		dt.decorator(ds);
		dt.show();


	}
}
