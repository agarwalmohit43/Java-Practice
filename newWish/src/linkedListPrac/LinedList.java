package linkedListPrac;


public class LinedList {

	Node head;

	public LinedList() {
		head = null;
	}

	public void addAtFirst(int value){
		Node node = new Node();
		node.setValue(value);
		node.setNext(head);
		head=node;
	}

	public void addAtLast(int value){
		Node node = new Node();
		node.setValue(value);
		node.setNext(null);

		if(head != null)
		{
			Node lastNode = new Node();
			lastNode = head;
			while(lastNode.getNext() != null){
				lastNode=lastNode.getNext();
			}
			lastNode.setNext(node);
			
		}else{
			node.setNext(head);
			head=node;
		}
	}
	
	
	public void addAtPos(int value,int pos) {

		if(getTotalElememt()==0)
		{
			if(pos ==1){
					Node node=new Node();
					node.setValue(value);
					node.setNext(head);
					head=node;
				
			}else{
				System.out.println("List is empty");
			}
		}else if(pos <= getTotalElememt() && pos != 0)
		{
			Node node=new Node();
			node.setValue(value);
			node.setNext(null);

			if(pos == 1){
				node.setNext(head);
				head=node;
			}else{
				Node lastNode = new Node();
				lastNode = head;
				for(int i=2;i<pos;i++){
					lastNode=lastNode.getNext();
				}
				node.setNext(lastNode.getNext());
				lastNode.setNext(node);
			}
		}else{
			System.out.println("Unable to add Node at position: "+pos+" , Enter a valid position between 1 to "+getTotalElememt());
		}
	}


	public void display(){
		Node node=new Node();
		node=head;
		while(node != null){
			System.out.println(node.getValue());
			node=node.getNext();
		}
	}

	public void deleteAtFirst() {

		head = head.getNext();
	}

	public void deleteAtEnd() {

		Node lastNode = new Node();
		lastNode=head;
		while(lastNode.getNext().getNext()!=null){
			lastNode = lastNode.getNext();
		}
		lastNode.setNext(null);
	}

	public void deleteAtPos(int pos) {
		if(getTotalElememt()==0)
		{
			System.out.println("List is empty");
		}else if(pos <= getTotalElememt() && pos != 0){
			if(pos == 1){
				head=head.getNext();
			}else{
				Node lastNode = new Node();
				lastNode = head;
				for(int i=2;i<pos;i++){
					lastNode = lastNode.getNext();
				}
				Node tempNode = new Node();
				tempNode=lastNode.getNext();
				lastNode.setNext(tempNode.getNext());
			}
		}else{
			System.out.println("Unable to delete Node at position: "+pos+" , Enter a valid position between 1 to "+getTotalElememt());
		}
	}


	public int getTotalElememt(){
		int count=0;
		Node lastNode =new Node();
		lastNode=head;
		while(lastNode!=null){
			lastNode = lastNode.getNext();
			count++;
		}

		return count;
	}

}
