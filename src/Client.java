
public class Client {

	public static void main(String[] args) {
		QueueProcess qp = new QueueProcess();
		System.out.println(qp.disp());
		qp.add(5);
		qp.add(6);
		qp.add("test");
		qp.add(8);
		System.out.println(qp.disp());
		System.out.println(qp.remove());
		System.out.println(qp.disp());
	}

}
