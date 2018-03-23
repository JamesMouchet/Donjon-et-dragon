
public abstract class ClassesAndObjet {

	public static void main(String[] args) {
		Person Jack = new Person();
		Person John = new Person(); // Crée une nouvelle instance de Person, Person() étant le constructeur
		  John.setAge(20);
		  Jack.setAge(25);
		  John.setName("John");
		  Jack.setName("Jack");
		  John.sayHelloto(Jack);
		  
		  System.out.println(John.getName() + " is " + John.getAge() + " Years old");
		  System.out.println(Jack.getName() + " is " + Jack.getAge() + " Years old");
		  	
	}

}
