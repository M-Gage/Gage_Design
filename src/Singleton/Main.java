package Singleton;

/**
 * @author MiaoGuozhu
 * @describtion
 * @date 2019/5/20 16:38
 */
public class Main {
	public static void main(String[] args) {
		NoSingleton n1 = NoSingleton.getNoSingleton();
		n1.print();
		NoSingleton n2 = NoSingleton.getNoSingleton();
		n2.print();
		System.out.println("--------------------------");

		Singleton s1 = Singleton.getSingleton();
		s1.print();
		Singleton s2 = Singleton.getSingleton();
		s2.print();
		System.out.println("--------------------------");

		HungerSingleton hs1 = HungerSingleton.getHungerSingleton();
		hs1.print();
		HungerSingleton hs2 = HungerSingleton.getHungerSingleton();
		hs2.print();
		System.out.println("--------------------------");

		LazySingleton ls1 = LazySingleton.getLazySingleton();
		ls1.print();
		LazySingleton ls2 = LazySingleton.getLazySingleton();
		ls2.print();
		System.out.println("--------------------------");

		IoDHSingleton is1 = IoDHSingleton.getIoDHSingleton();
		System.out.println(is1);
		IoDHSingleton is2 = IoDHSingleton.getIoDHSingleton();
		System.out.println(is2);
		System.out.println("--------------------------");


	}
}
