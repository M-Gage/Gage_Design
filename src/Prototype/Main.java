package Prototype;

import java.io.IOException;

/**
 * @author MiaoGuozhu
 * @describtion 原型模式
 * @date 2019/4/25 15:29
 */
public class Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		//需要原型实现Cloneable接口（可写好copy方法，就不需要其他类了）
		//创建克隆方法（copy)
		//具体原型继承原型
		SunWuKong s = new SunWuKong();
		s.setName("孙悟空");
		System.out.println(s.getName());
		System.out.println(s);
		s.setWeaponry("紫金袈裟","降魔杵，");
		SunWuKong cs = s.copy();
		System.out.println(cs.getName());
		System.out.println(cs);
		cs.setWeaponry("锁子黄金甲,凤翅紫金冠,藕丝步云履","如意金箍棒，");


		System.out.println(s.getWeaponry().getApparel()+s.getWeaponry().getArm());
		System.out.println(cs.getWeaponry().getApparel()+cs.getWeaponry().getArm());
//浅复制
		//孙悟空
		//Prototype.FenShengSu@4554617c
		//孙悟空
		//Prototype.FenShengSu@74a14482
		//如意金箍棒，锁子黄金甲,凤翅紫金冠,藕丝步云履
		//如意金箍棒，锁子黄金甲,凤翅紫金冠,藕丝步云履
//深复制
		//孙悟空
		//Prototype.SunWuKong@4554617c
		//孙悟空
		//Prototype.SunWuKong@6acbcfc0
		//降魔杵，紫金袈裟
		//如意金箍棒，锁子黄金甲,凤翅紫金冠,藕丝步云履


	}
}
