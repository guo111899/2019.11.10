
public abstract class Employee {
	private String id;// Ա�����
	private String name; // Ա������
	
	//�ղ������췽��
	public Employee() {
		super();
	}
	//�в������췽��
	public Employee(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//�������������󷽷���
	public abstract void work(); 
}

