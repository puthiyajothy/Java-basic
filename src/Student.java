
public class Student {

	public static void main(String[] args) {

		Emp emp = new Emp();

		Emp emp1 = new Emp();

		emp.show();
		emp1.show();

	}

}

class Emp {

	int eid;
	int salary;
	static String ceo;

	static {
		ceo = "dilu";
	}

	public Emp() {
		eid = 1;
		salary = 800;
	}

	public void show() {
		System.out.println(eid + ":" + salary + ":" + ceo);

	}

}
