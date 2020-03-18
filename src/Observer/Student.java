package Observer;

/**
 * @author MiaoGuozhu
 * @describtion
 * @date 2019/5/7 11:39
 */
public class Student implements IObserver {

	private String name;

	public Student(String name) {
		this.name = name;
	}

	@Override
	public void Update(String state) {
		System.out.println(name+"需要"+state);
	}
}
