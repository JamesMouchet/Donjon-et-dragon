
public class Person {
	int age;
	String name;
	
	public Person() {
		System.out.println("Person created");
	}


	public void sayHelloto(Person person) {
		System.out.println(getName() + " said hello to " + person.getName());
		
	}


	public int getAge() {

		return age;
	}


	public void setAge(int age) {

		this.age = age;
	}


	public String getName() {

		return name;
	}


	public void setName(String name) {

		this.name = name;
	}
}
