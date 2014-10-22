
	public class Till implements PersonQueue{
		private Person queueHead;
		private Person queueTail;

		public Till(){
			queueHead = null;
		}

		public void insert(Person newPerson){
			if (queueHead == null) {
				queueHead = newPerson;
				queueTail = newPerson;

			} else { 
				queueTail.prev = newPerson;
				newPerson.next = queueTail;
				queueTail = newPerson;
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
				return result; 
		} else {
			return null;
		}

	}
}