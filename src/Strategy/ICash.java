package Strategy;

import java.math.BigDecimal;

/**
 * @author MiaoGuozhu
 * @describtion 现金结算接口
 * @date 2019/4/19 15:28
 */
public interface ICash {

	BigDecimal getResult(BigDecimal money);
}
