
public class Supermarket{
	Till till1;
	Till till2;

	public Supermarket(Till till1, Till till2){
		this.till1 = till1;
		this.till2 = till2;
	}


	public void addPerson(Person person, Till till){
		till.insert(person);
	}

	public void servePerson(Till till){
		till.retrieve();
	}

public static void main(String[] args) {
	Till till1 = new Till("Till 1");
	Till till2 = new Till("Till 2");
	Supermarket tesco = new Supermarket(till1, till2);
	tesco.run();
}

public void run(){

	Person p1 = new Person("John");
	addPerson(p1, till1);
	Person p2 = new Person("Sam");
	addPerson(p2, till1);
	Person p3 = new Person("Anna");
	addPerson(p3, till1);
	Person p4 = new Person("James");
	addPerson(p4, till1);
	Person p5 = new Person("Emma");
	addPerson(p5, till1);
	Person p6 = new Person("Richard");
	addPerson(p6, till2);
	Person p7 = new Person("Louisa");
	addPerson(p7, till2);	
	Person p8 = new Person("Adam");
	addPerson(p8, till2);
	Person p9 = new Person("Rebecca");
	addPerson(p9, till2);
	Person p10 = new Person("Susan");
	addPerson(p10, till2);

	servePerson(till1);
	servePerson(till2);
	servePerson(till1);
	servePerson(till2);
	servePerson(till1);
	servePerson(till2);
	}


}