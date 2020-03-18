package Prototype;

import java.io.Serializable;

/**
 * @author MiaoGuozhu
 * @describtion 武器装备
 * @date 2019/4/28 16:50
 */
public class Weaponry implements Serializable {
	private String arm;
	private String apparel;

	public String getArm() {
		return arm;
	}

	public void setArm(String arm) {
		this.arm = arm;
	}

	public String getApparel() {
		return apparel;
	}

	public void setApparel(String apparel) {
		this.apparel = apparel;
	}

	//若是另一种方法的深复制那么就要也写一个复制方法
	/*public Weaponry copy() {
		try {
			return (Weaponry) this.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("这个复制不了啊");
			return new Weaponry();
		}
	}*/

}
