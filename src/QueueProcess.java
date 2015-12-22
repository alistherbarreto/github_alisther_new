import java.util.ArrayList;

public class QueueProcess {

	private ArrayList<Object> arr;

	public QueueProcess() {
		arr = new ArrayList<>();
	}

	void add(Object obj) {
		arr.add(arr.size(), obj);
	}

}
