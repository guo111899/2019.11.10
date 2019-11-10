
public class JavaEE extends Developer {
	public JavaEE() {
		super();
	}
	//有参数构造方法
	public JavaEE(String id, String name) {
		super(id, name);
	}

	@Override
	public void work() {
		System.out.println("员工号为 " + getId() + " 的 " + getName() + " 员工，正在研发淘宝网站");
	}
}
