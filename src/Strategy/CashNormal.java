package Strategy;

import java.math.BigDecimal;

/**
 * @author MiaoGuozhu
 * @describtion 正常结算类
 * @date 2019/4/19 15:54
 */
public class CashNormal implements ICash {

	@Override
	public BigDecimal getResult(BigDecimal money) {
		return money;
	}
}
