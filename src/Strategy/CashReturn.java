package Strategy;

import java.math.BigDecimal;

/**
 * @author MiaoGuozhu
 * @describtion 满减结算类
 * @date 2019/4/19 16:11
 */
public class CashReturn implements ICash {

	private BigDecimal full;
	private BigDecimal reduce;

	public CashReturn(BigDecimal full, BigDecimal reduce) {
		this.full = full;
		this.reduce = reduce;
	}

	@Override
	public BigDecimal getResult(BigDecimal money) {
		if (money.compareTo(full) > 0) {
			return money.subtract(reduce);
		}else {
			return money;
		}
	}
}
