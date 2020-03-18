package Factorys.EasyFactory;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author MiaoGuozhu
 * @describtion 简单工厂模式
 * @date 2019/4/18 17:31
 */
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.println("输入数字A:");
		String numberA = input.next();
		System.out.println("输入+，-，*，/：");
		String sign = input.next();
		System.out.println("输入数字B:");
		String numberB = input.next();
		//工厂根据运算符生成对应的运算类
		Operation oper = Factory.getOper(sign);
		if (oper != null) {
			oper.setNumberA(new BigDecimal(numberA));
			oper.setNumberB(new BigDecimal(numberB));
			//父类方法被子类重写成不同的运算方法
			BigDecimal result = oper.Calculation();
			System.out.println("结果是：" + result);
		} else {
			System.out.println("请正确输入运算符！");
		}
	}
}
