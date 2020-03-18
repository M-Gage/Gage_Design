package Bridge;

/**
 * @author MiaoGuozhu
 * @describtion 小米手机类
 * 都是具体类
 * @date 2019/5/17 15:42
 */
public class PhoneXm extends PhoneBrand {

	@Override
	void run() {
		System.out.print("小米手机");
		soft.run();
	}
}
