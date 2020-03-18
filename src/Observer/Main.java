package Observer;

import Observer.EventDelegation.EventMonitor;

/**
 * @author MiaoGuozhu
 * @describtion 观察者模式
 * @date 2019/5/7 10:07
 */
public class Main {
	public static void main(String[] args) throws Exception {
		Student s1 = new Student("湧满");
		Student s2 = new Student("志旭");
		Student s3 = new Student("劲宏");

		Commissary commissary = new Commissary();
		commissary.addObserver(s1);
		commissary.addObserver(s2);
		commissary.setState("交作业");
		commissary.Notify();

		System.out.println("---------------------------------------");
		ISubject monitor = new Monitor();
		//IObserver...o  循环最好不要用这个
		monitor.addObserver(s1,s2,s3);
		((Monitor) monitor).setState("打扫卫生");

		System.out.println("---------------------------------------");

		//使用事件委托可以对应不同的方法
		EventMonitor em = new EventMonitor();
		em.addObserver(s1,"Update","帮忙暖床");
		em.Notify();


	}
}
