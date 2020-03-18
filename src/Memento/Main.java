package Memento;

/**
 * @author MiaoGuozhu
 * @describtion 备忘录模式
 * @date 2019/5/15 11:35
 */
public class Main {
	public static void main(String[] args) {

		/*
		*作用：
		* 需要实现撤销操作。
		* 需要封装对象的历史状态，并且避免暴露给其他对象。
		*优点：
		* 提供状态恢复。对象恢复到特定的历史步骤。
		* 封装信息。备忘录保存了原发器的状态，并且只有原发器可以改动。
		*缺点：
		* 保存的类多了（设计模式的通病）
		*过程：
		* Originator（GameRole）发起者，需要自己选择保存（memento）和回滚（recoveryState）操作
		* Memento(GameRoleState)备忘录，用于保存需要改变的字段，储存发起者内部状态，处理发起者和管理人类，备忘录不直接和其他类交互
		* Caretaker 管理人，保存各状态的发起者保存的备忘录，但是不对备忘录操作或检查
		*
		* */
		GameRole gameRole = new GameRole();
		gameRole.afterMemento(100,34,65,100,16,"布小缪");
		gameRole.show();
		//我要存档啦
		Caretaker caretaker = new Caretaker();
		caretaker.setGameRoleState(gameRole.memento());
		//存档后
		gameRole.beforeMemento(5,45,70,30,17,"布小缪");
		gameRole.show();
		caretaker.setGameRoleState(gameRole.memento());
		/*
		* 加挡
		* */
		gameRole.beforeMemento(60,43,68,20,17,"一把过");
		//回档
		//回到第一步
		gameRole.recoveryState(caretaker.getGameRoleState(0));
		gameRole.show();
	}
}
