package Strategy;

import java.math.BigDecimal;

/**
 * @author MiaoGuozhu
 * @describtion 折扣结算类
 * @date 2019/4/19 15:59
 */
public class CashDiscount implements ICash {

	private BigDecimal rate;

	public CashDiscount(BigDecimal rate) {
		this.rate = rate;
	}

	@Override
	public BigDecimal getResult(BigDecimal money) {
		return money.multiply(rate);
	}
}
