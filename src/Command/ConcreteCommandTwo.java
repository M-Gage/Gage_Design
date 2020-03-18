package Command;

/**
 * @author MiaoGuozhu
 * @describtion
 * @date 2019/5/29 15:09
 */
public class ConcreteCommandTwo extends Command {
	//用单例模式?
	private Receiver receiver = new Receiver();


	@Override
	public void execute() {
		receiver.two();
	}


}
