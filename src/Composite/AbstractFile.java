package Composite;

/**
 * @author MiaoGuozhu
 * @describtion
 * @date 2019/5/15 17:24
 */
public abstract class AbstractFile {
	abstract void add(AbstractFile component);
	abstract void remove(AbstractFile component);
	abstract AbstractFile getComponent(int index);
	abstract void operation(String operation);

}
