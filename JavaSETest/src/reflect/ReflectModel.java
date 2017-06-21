package reflect;

public class ReflectModel {
	private int id;
	public String name;

	public static int static_int = 20;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ReflectModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReflectModel(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@SuppressWarnings("unused")
	private ReflectModel(String name) {
		super();
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String doit01() {
		return "public String doit01";
	}

	public static String doit02(int a, String s) {
		System.out.println("private void doit02----" + a + "----" + s);
		return a + s;
	}

	@Override
	public String toString() {
		System.out.println("ReflectModel01---toString");
		return "ReflectModel01";
	}

}
