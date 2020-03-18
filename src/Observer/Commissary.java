package Observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author MiaoGuozhu
 * @describtion 学习委员（具体通知者）
 * @date 2019/5/7 11:34
 */
public class Commissary implements ISubject {
	private List<IObserver> os = new ArrayList<>();
	private String state ;
	@Override
	public void addObserver(IObserver...o) {
		os.addAll(Arrays.asList(o));
	}

	@Override
	public void Notify() {
		for (IObserver o : os) {
			System.out.print("学习委员通知");
			o.Update(state);
		}
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
