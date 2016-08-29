public class _2_2 {
	public static void main(String [] args){
		Node n = new Node(1);
		n.appendToTail(654);
		n.appendToTail(12);
		n.appendToTail(586);
		n.appendToTail(12);
		n.appendToTail(6);	
		n.appendToTail(2);
		n.appendToTail(4);
		System.out.println(KthNode(n,5).data);
	}

	public static Node KthNode(Node head, int K){
		Node leader = head;
		Node chaser = head;
		for(int i = 0; i < K; i++){
			if(leader == null){
				return null;
			}
			leader = leader.next;
		}

		while(leader != null){
			chaser = chaser.next;
			leader = leader.next;
		}

		return chaser;
	}
}
