package Advance_Java_Telusco;
import java.util.PriorityQueue;
import java.util.Iterator;

public class PriorityQueueDemo
{
	public static void main(String[] args)
	{
		@SuppressWarnings("rawtypes")
		PriorityQueue q=new PriorityQueue();
		q.add("A");
		q.add("B");
		q.add("C");
		q.add("D");
		q.offer("B");
		// q.offer(60); // Heterogenous Data not Allowed
		//q.add(false);
		//q.add("Null");
		//q.add('P');
		
	System.out.println(q);// Insertion order reserved & duplicate Allowed
System.out.println(q.peek());//Retrieves, but does not remove, the head of this queue,or returns null if this queue is empty.
System.out.println(q.element());//  This method differs from peek only in that it throws an exception ifthis queue is empty. 

System.out.println(q.remove());// Removes a single instance of the specified element from this queue
System.out.println(q);
System.out.println(q.poll());// Retrieves and removes the head of this queue,or returns null if this queue is empty
System.out.println(q);
	}
}
