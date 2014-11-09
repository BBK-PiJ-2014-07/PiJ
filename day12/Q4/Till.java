
	public class Till implements PersonQueue{
		private Person queueHead;
		private Person queueTail;
		private String tillName;

		public Till(String s){
			queueHead = null;
			tillName = s;
		}

		public Person getHead() {
			return queueHead;
		}

		public Person getNext(Person p) {
			return p.getNextPerson();
		}

		public Person getPrev(Person p) {
			return p.getPrevPerson();
		}

		public Person getTail() {
			return queueTail;
		}
		public void insert(Person newPerson){
			if (queueHead == null) {
				queueHead = newPerson;
				queueTail = newPerson;
				System.out.print(newPerson.name + " has joined the queue in " + this.tillName + "\n");

			} else { 
				queueTail.prev = newPerson;
				newPerson.next = queueTail;
				queueTail = newPerson;
				System.out.print(newPerson.name + " has joined the queue in " + this.tillName + "\n");
			}
		}
		public Person retrieve(){
			if (queueTail != null) {
				Person result = queueHead;
				if (queueHead.prev != null) {
					queueHead.prev.next = null; //resassign next element's next as null so that it's not linked any more
				} else {
					queueHead = null;
					queueTail = null;
				}
				queueHead = queueHead.prev;
				System.out.println(result.name + " has been served!");
				return result; 
		} else {
			return null;
		}

	}


}