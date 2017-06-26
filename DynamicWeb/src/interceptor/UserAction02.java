package interceptor;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction02 extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String name;
	private String password;

	public String execute() throws Exception {
		return SUCCESS;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
