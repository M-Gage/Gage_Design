package Observer.EventDelegation;

import Observer.IObserver;

/**
 * @author MiaoGuozhu
 * @describtion 通知者接口
 * @date 2019/5/7 11:04
 */
public interface IEventSubject {
	void addObserver(Object object, String methodName, Object... args);
	void Notify() throws Exception;
}
