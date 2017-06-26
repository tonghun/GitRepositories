package struts2;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction01 extends ActionSupport {
	public static final long serialVersionUID = 1L;

	private User user;

	private Map<String, String> request;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String addUser() {
		ActionContext context = ActionContext.getContext();
		request = (Map<String, String>) context.get("request");
		request.put("name", user.getName());
		request.put("password", user.getPassword());
		return SUCCESS;
	}
}
