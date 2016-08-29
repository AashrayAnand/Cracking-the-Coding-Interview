public class _2_3 {
	public static void main(String [] args){
		Node n = new Node(4);
		n.appendToTail(4);
		n.appendToTail(5);
		n.appendToTail(9);
		n.appendToTail(2);
		n.appendToTail(4);
		n.appendToTail(5);
		n.appendToTail(9);
		n.appendToTail(2);
		System.out.println(n);
		deleteMiddle(n.next.next.next);
		System.out.println(n);
	}

	public static void deleteMiddle(Node curr){
		if(curr != null && curr.next != null){
			int newData = curr.next.data;
			curr.next = curr.next.next;
			curr.data = newData;
		}
	}
}
