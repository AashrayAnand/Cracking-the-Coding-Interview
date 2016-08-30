import java.util.*;

public class _2_7 {
	public static void main(String [] args){
		Node n = new Node(4);
		n.next = new Node(4);
		n.next.next = new Node(5);
		n.next.next.next = new Node(7);
		n.next.next.next.next = new Node(12);
		Node k = new Node(6);
		k.next = new Node(3);
		k.next.next = n.next.next;
		System.out.println(intersect(n,k));
	}

	public static Node intersect(Node head, Node otherHead){
		int length = getSize(head);
		int length2 = getSize(otherHead);
	
		Node shorter = length < length2 ? head : otherHead;
		Node longer = length < length2 ? otherHead : head;
		
		for(int i = 0; i < Math.abs(length - length2); i++){
			longer = longer.next;
		}
		
		if(getTail(head) != getTail(otherHead)){
			return null;
		}

		while(shorter != longer){
			shorter = shorter.next;
			longer = longer.next;
		}

		return longer;
	}

	public static Node getTail(Node curr){
		while(curr.next != null){
			curr = curr.next;
		}

		return curr;
	}


	public static int getSize(Node head){
		int count = 0;
		while(head != null){
			count++;
			head = head.next;
		}
		return count;
	}
}
