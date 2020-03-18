package ChainOfResponsibility;

/**
 * @author MiaoGuozhu
 * @describtion
 * @date 2019/5/30 17:57
 */
public class Request {
	//1:请假，2：加薪
	private String state;
	private Integer num;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}
}
