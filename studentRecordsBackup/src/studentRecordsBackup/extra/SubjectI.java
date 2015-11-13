package studentRecordsBackup.extra;

public interface SubjectI extends CommonInterface {

	public void addListener(ListenerI obj);
	public void deleteListener(ListenerI obj);
	public void notifyListener(int value);
}
