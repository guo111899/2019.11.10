
public class Hardware extends Maintainer {
	public Hardware() {
		super();
	}
	//�в������췽��
	public Hardware(String id, String name) {
		super(id, name);
	}

	@Override
	public void work() {
		System.out.println("Ա����Ϊ " + getId() + " �� " + getName() + " Ա���������޸���ӡ��");
	}
}

