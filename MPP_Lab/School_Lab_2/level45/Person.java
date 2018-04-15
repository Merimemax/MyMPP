package level45;

public class Person {

	private String name;
	private String phone;
	private int age;

	public Person(String name, String phone, int age) {
		this.name = name;
		this.phone = phone;
		this.age = age;
	}

	public Person() {
	}

	public String getPhone() {
		return phone;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", phone=" + phone + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}
}
