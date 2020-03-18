package Command;


/**
 * @author MiaoGuozhu
 * @describtion
 * @date 2019/5/17 17:39
 */
public class Main {
	public static void main(String[] args) {
		//将命令抽象再具体，是命令者（main）发出具体命令（concreteCommand）给调度者（invoker）去调度执行者(receiver)的操作
		//其中调度者可以对命令进行保存，修改
		Invoker i = new Invoker(new ConcreteCommandOne());

		i.call();

		i.setCommand(new ConcreteCommandTwo());
		i.call();


	}
}
