package Memento;

/**
 * @author MiaoGuozhu
 * @describtion 游戏角色类
 * @date 2019/5/15 11:44
 */
public class GameRole {
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 生命力
	 */
	private Integer vitality;

	/**
	 * 攻击力
	 */
	private Integer attack;

	/**
	 * 防御力
	 */
	private Integer defense;

	/**
	 * 魔法值
	 */
	private Integer magic;

	/**
	 * 等级
	 */
	private Integer level;

	/**
	 * 保存前的数值
	 *
	 * @author MiaoGuozhu
	 * @date 2019/5/15 11:52
	 */

	public void beforeMemento(Integer vitality, Integer attack, Integer defense, Integer magic, Integer level, String name) {
		this.name = name;
		this.attack = attack;
		this.vitality = vitality;
		this.defense = defense;
		this.magic = magic;
		this.level = level;
	}

	public void afterMemento(Integer vitality, Integer attack, Integer defense, Integer magic, Integer level, String name) {
		this.name = name;
		this.attack = attack;
		this.vitality = vitality;
		this.defense = defense;
		this.magic = magic;
		this.level = level;
	}

	public void show() {
		System.out.println("角色：" + name);
		System.out.println("等级:" + level);
		System.out.println("攻击力:" + attack);
		System.out.println("生命力:" + vitality);
		System.out.println("防御力:" + defense);
		System.out.println("魔法值:" + magic);
		System.out.println("------------------------");
	}

	public GameRoleState memento() {
		return new GameRoleState(vitality, attack, defense, magic);
	}

	public void recoveryState(GameRoleState gameRoleState) {
		this.attack = gameRoleState.getAttack();
		this.vitality = gameRoleState.getVitality();
		this.defense = gameRoleState.getDefense();
		this.magic = gameRoleState.getMagic();

	}


	public Integer getVitality() {
		return vitality;
	}

	public Integer getAttack() {
		return attack;
	}

	public Integer getDefense() {
		return defense;
	}

	public Integer getMagic() {
		return magic;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}
}
