package Memento;

/**
 * @author MiaoGuozhu
 * @describtion 需要保存的状态
 * @date 2019/5/15 13:53
 */
public class GameRoleState {

	/*
	* 说明只保存角色的生命，攻击，防御，魔法等内容，不包存名称和等级
	* */
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

	public GameRoleState(Integer vitality, Integer attack, Integer defense, Integer magic) {
		this.vitality = vitality;
		this.attack = attack;
		this.defense = defense;
		this.magic = magic;
	}

	public Integer getVitality() {
		return vitality;
	}

	public void setVitality(Integer vitality) {
		this.vitality = vitality;
	}

	public Integer getAttack() {
		return attack;
	}

	public void setAttack(Integer attack) {
		this.attack = attack;
	}

	public Integer getDefense() {
		return defense;
	}

	public void setDefense(Integer defense) {
		this.defense = defense;
	}

	public Integer getMagic() {
		return magic;
	}

	public void setMagic(Integer magic) {
		this.magic = magic;
	}
}
