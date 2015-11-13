package studentRecordsBackup.extra;

public interface CommonInterface {
	
	public int getKey();
	public void setKey(int key);
	public CommonInterface getLeft();
	public void setLeft(CommonInterface left);
	public CommonInterface getRight();
	public void setRight(CommonInterface right);
	public void notifyListener(int value);

}
