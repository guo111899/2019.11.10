
public class Network extends Maintainer{
	public Network() {
		super();
	}
	//�в������췽��
	public Network(String id, String name) {
		super(id, name);
	}

	@Override
	public void work() {
		System.out.println("Ա����Ϊ " + getId() + " �� " + getName() + " Ա�������ڼ�������Ƿ�ͨ");
	}
}