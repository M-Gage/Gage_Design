package Observer.EventDelegation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MiaoGuozhu
 * @describtion
 * @date 2019/5/7 15:54
 */
public class EventHanlder {
	private List<Event> es = new ArrayList<>();

	//添加某个对象要执行的事件，及需要的参数
	public void addEvent(Object object, String methodName, Object... args) {
		es.add(new Event(object, methodName, args));
	}

	//通知所有的对象执行指定的事件
	public void notifyX() throws Exception {
		for (Event e : es) {
			e.invoke();
		}
	}
}
