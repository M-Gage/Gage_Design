package Observer.EventDelegation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MiaoGuozhu
 * @describtion
 * @date 2019/5/7 16:11
 */
public class EventMonitor implements IEventSubject {

	private List<EventHanlder> ehs = new ArrayList<>();

	@Override
	public void addObserver(Object object, String methodName, Object... args) {
		EventHanlder eh = new EventHanlder();
		eh.addEvent( object,  methodName,  args);
		ehs.add(eh);
	}

	@Override
	public void Notify() throws Exception {
		System.out.print("老师通知");
		for (EventHanlder eh : ehs) eh.notifyX();
	}
}
