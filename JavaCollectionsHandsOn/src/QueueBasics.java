import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> q1 = new PriorityQueue<>();
		
		Queue<String> q2 = new LinkedList<>();
		
		
		q1.add(12);
		q1.add(23);
		q1.add(45);
		
		q1.offer(89);
		q1.offer(0);
		q1.offer(2);
		
		System.out.println(q1);
		System.out.println(q1.remove());
		System.out.println(q1);
		
		System.out.println(q1.peek());
		System.out.println(q1);
		
		
		
		
		q2.add("bloom");
		q2.add("with");
		q2.add("grace");
		
		System.out.println(q2);
		q2.poll();
		System.out.println(q2);
		q2.offer("bloom");
		q2.element();
		System.out.println(q2);
		
		
		
		
		

	}

}
