package Factorys.EasyFactory;

import java.math.BigDecimal;

/**
 * @author MiaoGuozhu
 * @describtion 加法运算类
 * @date 2019/4/18 17:45
 */
public class OperationAdd extends Operation {
	@Override
	public BigDecimal Calculation() {
		return getNumberA().add(getNumberB());
	}
}
