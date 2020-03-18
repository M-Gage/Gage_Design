package Prototype;

import java.io.*;

/**
 * @author MiaoGuozhu
 * @describtion 具体原型
 * @date 2019/4/28 15:08
 */
public class SunWuKong implements Serializable {

	private String name;
	private Weaponry weaponry;

	public SunWuKong() {
		this.weaponry = new Weaponry();
	}

//	public SunWuKong( Weaponry w) {
//		this.weaponry = w.copy();
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Weaponry getWeaponry() {
		return weaponry;
	}

	public void setWeaponry(String arm, String apparel) {
		weaponry.setApparel(apparel);
		weaponry.setArm(arm);
	}

	//用java的clone方法浅复制简单但是要深复制可以实现但是很麻烦，所以可以使用同样为标识接口的序列化接口
	 /*SunWuKong copy(){
		//可以这种方式克隆，但是需要每个字段都对应上，被摒弃
		//return new FenShengSu(super.getName());
		Object prototype = null;
		try {
			prototype = super.clone();
			return (SunWuKong) prototype;
		} catch (CloneNotSupportedException e) {
			System.out.println("不能复制");
			return null;
		}
	}*/

	//深复制
	SunWuKong copy() throws IOException, ClassNotFoundException {
		//将对象写入流中
		ByteArrayOutputStream bao = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bao);
		oos.writeObject(this);
		//将对象从流中读出
		ByteArrayInputStream bai = new ByteArrayInputStream(bao.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bai);
		return (SunWuKong) ois.readObject();
	}

}
