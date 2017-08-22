package linkedList;

public class LinkedList {
	
	Node head;
	
	public LinkedList() {
		head=null;
	}
	
	public void addAtFirst(int value){
		
		Node node =new Node();
		node.setValue(value);
		node.setNode(head);
		head = node;
		/*if(head == null)
		{
			head = new Node();
			head.setValue(value);
			head.setNode(null);
		
		}else if(head!= null){
			Node node=new Node();
			head.setNode(node);
			node.setValue(value);
			node.setNode(null);
			
		}*/
	}
	
	public void display(){
		Node node =new Node();
		node=head;
		while(node != null){
			System.out.println(node.getValue());
			node=node.getNode();
		}
	}

	public void add(int i) {

		Node node =new Node();
		node.setValue(i);
		node.setNode(null);
		
		Node node2=new Node();
		node2=head;
		while(node2.getNode() !=null){
			node2=node2.getNode();
		}
		node2.setNode(node);
	}
}
