package Strategy;

import java.math.BigDecimal;

/**
 * @author MiaoGuozhu
 * @describtion
 * @date 2019/4/19 16:22
 */
public class Context {

	private ICash cash;

	public Context(ICash cash) {
		this.cash = cash;
	}

	public  BigDecimal settlement(BigDecimal money){
		return cash.getResult(money);
	}
}
