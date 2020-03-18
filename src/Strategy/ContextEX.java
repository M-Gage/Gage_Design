package Strategy;

import java.math.BigDecimal;

/**
 * @author MiaoGuozhu
 * @describtion
 * @date 2019/4/19 16:22
 */
public class ContextEX {

	private Context cash ;

	public ContextEX(BigDecimal numberA,BigDecimal numberB) {

		if (numberA.compareTo(BigDecimal.ZERO)==0) {
			cash = new Context(new CashNormal());
		}else {
			if (numberB.compareTo(BigDecimal.ZERO)==0) {
				cash = new Context(new CashDiscount(numberA));
			}else {
				cash = new Context(new CashReturn(numberA,numberB));
			}
		}
	}

	public  BigDecimal settlement(BigDecimal money){
		return cash.settlement(money);
	}
}
