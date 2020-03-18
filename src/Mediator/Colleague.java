package Mediator;

/**
 * @author MiaoGuozhu
 * @describtion
 * @date 2019/5/31 14:59
 */
public abstract class Colleague {

	public Mediator mediator;

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	//转发调用
	public void changed() {
		mediator.colleagueChanged(this);
	}
	public abstract void method();
}
