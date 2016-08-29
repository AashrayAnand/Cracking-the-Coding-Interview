public class _2_6 {
	public static void main(String [] args){
			Node n = new Node(5);
			n.appendToTail(4);
			n.appendToTail(3);
			n.appendToTail(4);
			n.appendToTail(5);
			System.out.println(isPalindrome(n));
		}

	public static boolean isPalindrome(Node head){
		Node back = reverseList(head);
		while(back != null){
			if(back.data != head.data){
				return false;
			}
			back = back.next;
			head = head.next;
		}
		return true;
	}

	public static Node reverseList(Node curr){
		Node head = null;
		while(curr != null){
			Node n = new Node(curr.data);
			n.next = head;
			head = n;
			curr = curr.next;
		}
		return head;
	}
}
