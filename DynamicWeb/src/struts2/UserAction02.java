package struts2;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction02 extends ActionSupport implements ModelDriven<User> {

	private User user = new User();

	public User getModel() {
		return user;
	}

	public String addUser() {
		ActionContext context = ActionContext.getContext();
		Map<String, String> request = (Map<String, String>) context.get("request");
		request.put("name", user.getName());
		request.put("passwod", user.getPassword());
		return SUCCESS;
	}
}
