import java.util.*;
public class CallName {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>(); 
		addStudent(list);
		printStudent(list);
		randomStudent(list);
	}
	public static void addStudent(ArrayList<Student> list) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			Student s = new Student();
			System.out.println("存储第"+i+"个学生姓名：");
			String name = sc.next();
			s.setName(name);
			System.out.println("存储第"+i+"个学生年龄：");
			int age = sc.nextInt();
			s.setAge(age);
			list.add(s);
		}
	}
	public static void printStudent (ArrayList<Student> list) {
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			System.out.println("姓名："+s.getName() +",年龄："+s.getAge());
		}
	}
	
	public static void randomStudent (ArrayList<Student> list) {
		//在班级总人数范围内，随机产生一个随机数
		int index = new Random().nextInt(list.size());
		//在容器（ArrayList集合）中，查找该随机数所对应的同学信息（姓名、年龄）
		Student s = list.get(index);
		System.out.println("被随机点名的同学："+s.getName() + "，年龄:" + s.getAge());
	}
	}


