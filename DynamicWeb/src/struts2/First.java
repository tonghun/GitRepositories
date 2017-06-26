package struts2;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class First implements Action {

	ActionSupport obj = new ActionSupport();

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return SUCCESS;
	}

}
