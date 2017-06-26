package ognl;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class OGNLAction01 extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private String name;
	private Student student;
	Map<String, Object> request;

	private String arr[] = new String[] { "中国", "美国" };

	public String[] getArr() {
		return arr;
	}

	public void setArr(String[] arr) {
		this.arr = arr;
	}

	public OGNLAction01() {
		student = new Student();
		student.setId(1);
		student.setName("张三");
		name = "tom";
		request = (Map<String, Object>) ActionContext.getContext().get("request");
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String execute() throws Exception {
		request.put("info", "request测试");
		return SUCCESS;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
