public class Person {
	public String name;
	public Person next;
	public Person prev;

	public Person(String name){
		this.name = name;
		this.next = null;
		this.prev = null;
	}
	public Person getPrevPerson(){
		return this.prev;
	}
	public Person getNextPerson(){
		return this.next;
	}

}


