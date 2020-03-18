package Factorys.EasyFactory;

import java.math.BigDecimal;

/**
 * @author MiaoGuozhu
 * @describtion 运算类
 * @date 2019/4/18 17:39
 */
public class Operation {
	private BigDecimal numberA;
	private BigDecimal numberB;

	public BigDecimal getNumberA() {
		return numberA;
	}

	public void setNumberA(BigDecimal numberA) {
		this.numberA = numberA;
	}

	public BigDecimal getNumberB() {
		return numberB;
	}

	public void setNumberB(BigDecimal numberB) {
		this.numberB = numberB;
	}

	public  BigDecimal Calculation() throws Exception {
		return new BigDecimal(0);
	}
}
