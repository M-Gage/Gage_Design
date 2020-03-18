package Strategy;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author MiaoGuozhu
 * @describtion 策略模式
 * @date 2019/4/19 14:43
 */
public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("输入数字A:");
		BigDecimal numberA = new BigDecimal(input.next());
		System.out.println("输入数字B:");
		BigDecimal numberB = new BigDecimal(input.next());

		BigDecimal money = new BigDecimal(498.00);

		Context cash;
		if (numberA.compareTo(BigDecimal.ZERO)==0) {
			//1:利用实现接口创建不同策略的实现类
			//2:使用上下文类的构造方法初始化不同策略
			//3：上下文类里面调用策略方法
			//重点：构造方法传策略对象
			cash = new Context(new CashNormal());
		}else {
			if (numberB.compareTo(BigDecimal.ZERO)==0) {
				cash = new Context(new CashDiscount(numberA));
			}else {
				cash = new Context(new CashReturn(numberA,numberB));
			}
		}

		ContextEX ce = new ContextEX(numberA,numberB);
		BigDecimal ceResult = ce.settlement(money);
		BigDecimal result = cash.settlement(money);
		System.out.println("策略模式："+result);
		System.out.println("策略—简单工厂模式："+ceResult);
	}
}
