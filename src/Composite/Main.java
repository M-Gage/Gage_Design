package Composite;

/**
 * @author MiaoGuozhu
 * @describtion 组合模式
 * @date 2019/5/15 17:22
 */
public class Main {
	public static void main(String[] args) {

		//作用：
		// 1.在具有整体和部分的层次结构中，希望通过一种方式忽略整体与部分的差异，客户端可以一致地对待它们。
		// 2.在一个使用面向对象语言开发的系统中需要处理一个树形结构。
		// 3.在一个系统中能够分离出叶子对象和容器对象，而且它们的类型不固定，需要增加一些新的类型。
		//优点：
		// 1.组合模式可以清楚地定义分层次的复杂对象，表示对象的全部或部分层次，它让客户端忽略了层次的差异，方便对整个层次结构进行控制。
		// 2.客户端可以一致地使用一个组合结构或其中单个对象，不必关心处理的是单个对象还是整个组合结构，简化了客户端代码。
		// 3.在组合模式中增加新的容器构件和叶子构件都很方便，无须对现有类库进行任何修改，符合“开闭原则”。
		// 4.组合模式为树形结构的面向对象实现提供了一种灵活的解决方案，通过叶子对象和容器对象的递归组合，可以形成复杂的树形结构，但对树形结构的控制却非常简单。
		//缺点：
		// 在增加新构件时很难对容器中的构件类型进行限制，比如我们如果想文本文件夹里面不能添加其他文件夹只能添加文件
		AbstractFile fileFolder = new FileFolder("布小缪的宝贝文件");
		AbstractFile pff = new FileFolder("图片文件夹");
		AbstractFile tff = new FileFolder("文本文件夹");
		AbstractFile vff = new FileFolder("音视频文件夹");
		//不要自己添加自己，子类也不可以，总之在一条线上都不可以，会死循环
		fileFolder.add(pff);
		fileFolder.add(tff);
		fileFolder.add(vff);

		AbstractFile pic = new PicFile("高清美女");
		AbstractFile txt = new PicFile("黄色小说");
		AbstractFile vido = new PicFile("岛国枫叶");
		AbstractFile vido1 = new PicFile("高清无码");

		pff.add(pic);
		tff.add(txt);
		vff.add(vido);
		vff.add(vido1);

		fileFolder.operation("杀毒");
		System.out.println("=========================");
		vff.operation("删除");
	}
}
