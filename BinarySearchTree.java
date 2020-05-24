
public class BinarySearchTree {

	class Node {
		Node left, right;
		int data;

		public Node(int data) {
			this.data = data;
		}

		/*Tree structure as follows
		 * starting at root node, left branch is less then 
		 * right branch greater then
		 */inorder traversal follows,left-->head--->right 
		//insert into tree method
		
		public void insert(int value) {
			
			 
			 if (value <= data) {
				if (left == null) {
					//insert value into left branch
					left = new Node(value);
				} else {
					//recursion
					left.insert(value);
				}
			}

			else {
				if (right == null) {
					//insert value into right branch
					right = new Node(value);
				} else {
					//recursion
					right.insert(value);
				}
			}
		}

		public boolean contains(int value) {
			
			if (value == data) {
				return true;
			} 
			else if (value < data) {
				if (left == null) {
					return false;
				} 
				else {
					return left.contains(value);
				}
			} 
			
			else {
				if (right == null) {
					return false;
				} 
				else {
					return right.contains(value);
				}
			}
		}
		
		public void printInOrder() {
			if(left!=null) {
				left.printInOrder();
			}
			System.out.println(data);
			if(right!=null) {
				right.printInOrder();
			}
		}

		
		
		
		
		
		
	}

}
