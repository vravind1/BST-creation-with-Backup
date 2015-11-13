package studentRecordsBackup.extra;

public interface BSTI {

	public CommonInterface getRoot();
	public void setRoot(CommonInterface root);
	public void insert(CommonInterface root, CommonInterface newNode);
	public void printInorder();
	public void update(int value);
	public int sum();
}
