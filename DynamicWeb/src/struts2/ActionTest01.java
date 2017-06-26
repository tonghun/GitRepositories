package struts2;

import com.opensymphony.xwork2.ActionSupport;

public class ActionTest01 extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String city;
	private String sex;
	private String[] hobby;

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
