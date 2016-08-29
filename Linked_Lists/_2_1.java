public class _2_1 {
	public static void main(String [] args){
		Node n = new Node(1);
		n.appendToTail(2);	
		n.appendToTail(2);
		n.appendToTail(2);
		System.out.println(n);
		removeDuplicates(n);
		System.out.println(n);
	}

	public static void removeDuplicates(Node head){
		Node curr = head;
		while(curr != null){
			Node check = curr;
			while(check.next != null){
				if(check.next.data == curr.data){
					check.next = check.next.next;
				}else{
					check = check.next;
				}
			}
			curr = curr.next;
		}
	}
}
