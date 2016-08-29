public class _2_8 {
	public static void main(String [] args){
		Node n = new Node(1);
		n.next = new Node(2);
		n.next.next = new Node(3);
		n.next.next.next = new Node(4);
		n.next.next.next.next = new Node(5);
		n.next.next.next.next.next = new Node(6);
		Node curr = n;
		while(curr.next != null){
			curr = curr.next;
		}
		curr.next = n.next.next;
		System.out.println(frontOfCycle(n).data);
	}

	public static Node frontOfCycle(Node head){
		Node slow = head;
		Node fast = head;
		while(fast.next != null && fast.next.next != null){
			slow = slow.next;
			fast = fast.next.next;
			
			if(fast.data == slow.data){
				break;
			}
		}
		slow = head;
		while(slow.data != fast.data){
			slow = slow.next;
			fast = fast.next;
		}

		return fast;
		
	}
}
