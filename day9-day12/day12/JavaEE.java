
public class JavaEE extends Developer {
	public JavaEE() {
		super();
	}
	//�в������췽��
	public JavaEE(String id, String name) {
		super(id, name);
	}

	@Override
	public void work() {
		System.out.println("Ա����Ϊ " + getId() + " �� " + getName() + " Ա���������з��Ա���վ");
	}
}
