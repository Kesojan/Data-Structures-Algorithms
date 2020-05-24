/* SLList implementation
 * Kesojan Premakumar
 * May 17 2020
 */
import java.util.*;

public class SLList {
	private IntNode sentinel;
	private IntNode first;
	private int size;
	
	public class IntNode{
		
		public int item;
		public IntNode next;
		
		public IntNode(int i, IntNode n) {
			item=i;
			next=n;
		}
	}
	
	// Main method with test calls
	public static void main(String[] args) {
		SLList L = new SLList(15); //List: 15
		L.addFirst(10); 
		L.addFirst(5); 
		L.addFirst(20);
		//List:20,5,10,16
		
		System.out.println(L.size());
	}
	
	// SSList constructor
	public SLList(int x) {
		sentinel = new IntNode(63, null);
		sentinel.next= new IntNode(x, null);
		size=1;
	}
	
	public SLList() {
		sentinel =new IntNode(63,null);
		size=0;
	}
	
	
	// Adds x to the front of the list
	public void addFirst(int x) {
		sentinel.next=new IntNode(x,sentinel.next); // push old first behind x
		size+=1;
	}
	
	
	// returns value of first place
	public int getFirst() {
		return sentinel.next.item;

	}
	
	
	public void addLast(int x) {
		size+=1;
		IntNode p=sentinel;
		// moves p to end of the list
		while(p.next!=null) {
		p=p.next;
		}
		p.next =new IntNode(x,null);
		
	}
	
	
	public int size() {
		return size;
	}
	
}










