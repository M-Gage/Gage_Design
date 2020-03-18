package Facade;

/**
 * @author MiaoGuozhu
 * @describtion
 * @date 2019/5/5 13:42
 */
public class Service {
	private Mapper1 m1;
	private Mapper2 m2;
	private Mapper3 m3;
	public Service() {
		m1=new Mapper1();
		m2=new Mapper2();
		m3=new Mapper3();
	}


	public void serviceMethod(){
		m1.method1();
		m2.method2();
		m3.method3();
	}
}
