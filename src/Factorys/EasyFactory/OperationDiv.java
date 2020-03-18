package Factorys.EasyFactory;

import java.math.BigDecimal;

/**
 * @author MiaoGuozhu
 * @describtion 除法运算类
 * @date 2019/4/18 17:45
 */
public class OperationDiv extends Operation {
	@Override
	public BigDecimal Calculation() throws Exception {

		BigDecimal numberB = getNumberB();
		if (numberB.compareTo(new BigDecimal(0))==0){
			throw new Exception("不能除0" );
		}
		return getNumberA().divide(numberB);
	}
}
