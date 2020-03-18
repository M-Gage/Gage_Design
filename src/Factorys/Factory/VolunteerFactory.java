package Factorys.Factory;

/**
 * @author MiaoGuozhu
 * @describtion
 * @date 2019/4/25 11:01
 */
public class VolunteerFactory implements ILeiFengFactory {
	@Override
	public StudyLeiFeng createLeiFeng() {
		return new Volunteer();
	}
}
