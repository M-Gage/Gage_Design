package Factorys.EasyFactory;

/**
 * @author MiaoGuozhu
 * @describtion
 * @date 2019/4/18 19:02
 */
public class Factory {

	public static Operation getOper(String signs) {
		Operation oper = null;
		switch (signs){
			case "+":
				oper = new OperationAdd();
				break;
			case "/":
				oper = new OperationDiv();
				break;
			case "-":
				oper = new OperationSub();
				break;
			case "*":
				oper = new OperationMul();
				break;
		}
		return oper;
	}

}
