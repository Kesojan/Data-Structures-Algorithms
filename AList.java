/* Array List
 * Kesojan P
 * May 23 2020
 */

public class AList {
	
	private int [] items
	private int size;
	
	private void resize(int capacity) {
		int []a =new int[capacity];
		System.arraycopy(items, 0, a, 0, size);
		items=a;
	}
	
	
	
	public AList() {
	items=new int [100];
	size=0;
	}
	public 
	
	public void addLast(int x) {
		if(size==items.length) {
			resize(size+1);
		}
		items[size]=x;
		size+=1;
	}
	
	public int getLast() {
		return items[size-1];
		
	}
	
	public int get (int i) {
		return items[i];
		
	}
	
	public int size() {
		return size;
	}
	public int removeLast() {
		int x=getLast();
		size=size-1;
		return x;
		
	}
}
