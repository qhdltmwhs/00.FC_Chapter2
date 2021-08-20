package ch12;

public class Person {

	String name;
	int age;

	public Person() {
		/*
		 * 생성자에서 다른 생성자를 호출하는 < this >
		 */
		this("no name", 1);
	}

	public Person(String name, int age) {
		/*
		 * 생성된 인스턴스 메모리의 주소를 가지는 < this >
		 */
		this.name = name;
		this.age = age;
	}

	public void showPerson() {
		System.out.println(name + ", " + age);
	}

	public Person getPerson() {
		/*
		 * 자신의 주소를 반환하는 < this >
		 */
		return this;
	}

	public static void main(String[] args) {

		Person person = new Person();
		person.showPerson();
		System.out.println(person);
		
		Person person2 = person.getPerson();
		System.out.println(person2);
		
		Person person3 = new Person().getPerson();
		System.out.println(person3);

	}

}
