package studentRecordsBackup.bst;


import java.util.ArrayList;

import studentRecordsBackup.extra.CommonInterface;
import studentRecordsBackup.extra.ListenerI;
import studentRecordsBackup.extra.SubjectI;

public class Node implements SubjectI, ListenerI, CommonInterface {

	private int key;
	CommonInterface left, right;
	ArrayList<ListenerI> listeners = new ArrayList<ListenerI>();
	
	public Node(int key) {
		this.key = key;
		left = null;
		right = null;
	}
	
	public Node(int key, SubjectI node){
		this.key = key;
		left = null;
		right =null;
		node.addListener(this);
	}

	/** Method to get key
	 * @return key
	 */
	public int getKey(){
		return key;
	}
	
	/** Method to set key
	 * @param key
	 * @return void
	 */
	public void setKey(int key){
		this.key = key;
	}
	
	/** Method to get left node
	 * @return left node
	 */
	public CommonInterface getLeft(){
		return left;
	}
	
	/** Method to set left node
	 * @param node
	 * @return void
	 */
	public void setLeft(Node left){
		this.left = left;
	}
	
	/** Method to get right node
	 * @return right node
	 */
	public CommonInterface getRight(){
		return right;
	}
	
	/** Method to set right node
	 * @param node
	 * @return void
	 */
	public void setRight(Node right){
		this.right = right;
	}
	
	/** Method to add listeners
	 * @param listener object
	 * @return void
	 */
	public void addListener(ListenerI obj){
		listeners.add(obj);
	}
	
	/** Method to notify all listeners
	 * @param update value
	 * @return void
	 */
	public void notifyListener(int value){
		for(ListenerI obj:listeners){
			obj.update(value);
		}
	}
	
	/** Method to update
	 * @param update value
	 * @return void
	 */
	public void update(int value){		
		key += value;
	}
	
	/** Method to set left
	 * @param CommonInterface
	 * @return void
	 */
	public void setLeft(CommonInterface left){
		this.left = left;
	}

	/** Method to set right
	 * @param CommonInterface
	 * @return void
	 */
	public void setRight(CommonInterface right){
		this.right = right;
	}
	
	/** Method to delete listener
	 * @param lsitener object
	 * @return void
	 */
	public void deleteListener(ListenerI obj){
		listeners.remove(obj);
	}
}
