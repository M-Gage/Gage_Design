package Observer;

/**
 * @author MiaoGuozhu
 * @describtion 通知者接口
 * @date 2019/5/7 11:04
 */
public interface ISubject {
	void addObserver(IObserver...o);
	void Notify();
}
