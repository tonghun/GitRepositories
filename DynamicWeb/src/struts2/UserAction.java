package struts2;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

	public static final long serialVersionUID = 1L;
	private String info;

	public String add() throws Exception {
		info = "����û���Ϣ";
		return "add";
	}

	public String update() throws Exception {
		info = "�����û���Ϣ";
		return "update";
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
}
