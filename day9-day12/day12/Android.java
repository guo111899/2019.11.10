
public class Android extends Developer{
	public Android() {
		super();
	}
	//�в������췽��
	public Android(String id, String name) {
		super(id, name);
	}

	@Override
	public void work() {
		System.out.println("Ա����Ϊ " + getId() + " �� " + getName() + " Ա���������з��Ա��ֻ��ͻ������");
	}
}
