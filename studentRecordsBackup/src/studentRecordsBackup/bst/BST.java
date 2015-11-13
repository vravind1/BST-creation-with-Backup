package studentRecordsBackup.bst;

import studentRecordsBackup.extra.BSTI;
import studentRecordsBackup.extra.CommonInterface;

public class BST implements BSTI {
	CommonInterface root;

	public BST() {
		root = null;
	}

	/** Method to get root
	 * @return root
	 */
	public CommonInterface getRoot() {
		return root;
	}

	/** Method to set root
	 * @param CommonInterface
	 * @return void
	 */
	public void setRoot(CommonInterface root) {
		this.root = root;	
	}

	/** Method to insert node to the tree
	 * @param root and new node
	 * @return void
	 */
	public void insert(CommonInterface root, CommonInterface newNode) {
		if(root == null){
			this.root = newNode;
			return;
		}
		if(newNode.getKey() <= root.getKey()){
			if(root.getLeft() == null){
				root.setLeft(newNode);
			}
			else{
				insert(root.getLeft(), newNode);
			}
		}
		else{
			if(root.getRight() == null){
				root.setRight(newNode);
			}
			else{
				insert(root.getRight(), newNode);
			}
		}
	}

	/** Method to print tree in inorder
	 * @return void
	 */
	public void printInorder() {
		printInorder(root);
	}

	/** Method to print tree in inorder helper function
	 * @param root
	 * @return void
	 */
	public void printInorder(CommonInterface root){
		if(root != null){
			printInorder(root.getLeft());
			System.out.println(root.getKey());
			printInorder(root.getRight());
		}
	}
	
	/** Method to update the node
	 * @param update value
	 * @return void
	 */
	public void update(int value) {
		update(root, value);
	}

	/** Method to update the node helper function
	 * @param node, update value
	 * @return void
	 */
	public void update(CommonInterface node, int value){
		if(node != null){
			update(node.getLeft(), value);
			node.notifyListener(value);
			node.setKey(node.getKey() + value);
			update(node.getRight(), value);
		}
	}
	
	/** Method to get sum of all nodes
	 * @return sum
	 */
	public int sum() {
		int sum = sum(root);
		return sum;
	}

	/** Method to get sum of all nodes helper function
	 * @param node
	 * @return sum
	 */
	public int sum(CommonInterface node){
		if(node == null){
			return 0;
		}
		else if((node.getLeft() == null) && (node.getRight() == null)){
			return node.getKey();
		}
		else{
			return node.getKey() + sum(node.getLeft()) + sum(node.getRight());
		}
	}
}
