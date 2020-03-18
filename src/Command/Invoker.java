package Command;

/**
 * @author MiaoGuozhu
 * @describtion
 * @date 2019/5/29 15:09
 */
public class Invoker {
	//可以用集合来管理，最后统一执行
	private Command command;

	public Invoker(Command command) {
		this.command = command;
	}

	public Invoker setCommand(Command command) {
		this.command = command;
		return this;
	}

	public void call(){
		command.execute();
	}
}
