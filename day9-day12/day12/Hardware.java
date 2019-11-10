
public class Hardware extends Maintainer {
	public Hardware() {
		super();
	}
	//有参数构造方法
	public Hardware(String id, String name) {
		super(id, name);
	}

	@Override
	public void work() {
		System.out.println("员工号为 " + getId() + " 的 " + getName() + " 员工，正在修复打印机");
	}
}

