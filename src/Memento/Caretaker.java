package Memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MiaoGuozhu
 * @describtion 档案管理者
 * @date 2019/5/15 15:00
 */
public class Caretaker {
	private List<GameRoleState> gameRoleState ;


	public Caretaker() {
		this.gameRoleState = new ArrayList<>();
	}

	public GameRoleState getGameRoleState(Integer index) {
		return gameRoleState.get(index);
	}

	public void setGameRoleState(GameRoleState gameRoleState) {
		this.gameRoleState.add(gameRoleState);
	}
}
