package hibernate.package03;

public class IDcard {

	private int id;
	private String idcard_code;
	private People people;

	public People getPeople() {
		return people;
	}

	public void setPeople(People people) {
		this.people = people;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdcard_code() {
		return idcard_code;
	}

	public void setIdcard_code(String idcard_code) {
		this.idcard_code = idcard_code;
	}

}
