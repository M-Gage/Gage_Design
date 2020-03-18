package Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MiaoGuozhu
 * @describtion
 * @date 2019/5/16 10:09
 */
public class FileFolder extends AbstractFile {
	List<AbstractFile> files = new ArrayList<>();
	private String name;
	public FileFolder(String name) {
		this.name=name;
	}

	@Override
	void add(AbstractFile component) {
		files.add(component);
	}

	@Override
	void remove(AbstractFile component) {
		files.remove(component);
	}

	@Override
	AbstractFile getComponent(int index) {
		return files.get(index);
	}

	@Override
	void operation(String operation) {
		System.out.println("对文件夹 "+name +" 进行 "+operation+" 操作");
		for (AbstractFile file : files) {
			file.operation(operation);
		}
	}
}
