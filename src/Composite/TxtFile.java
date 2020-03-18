package Composite;

/**
 * @author MiaoGuozhu
 * @describtion
 * @date 2019/5/15 18:16
 */
public class TxtFile extends AbstractFile {
	private String name;
	public TxtFile(String name) {
		this.name = name;
	}

	@Override
	void add(AbstractFile component) {

	}

	@Override
	void remove(AbstractFile component) {

	}

	@Override
	AbstractFile getComponent(int index) {
		return null;
	}

	@Override
	void operation(String operation) {
		System.out.println("对文本文件 "+name +" 进行 "+operation+" 操作");
	}
}
