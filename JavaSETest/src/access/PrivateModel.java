package access;

/**
 * 定义一个私用实例变量，通过方法访问
 * 
 * @author tonghuo
 *
 */

public class PrivateModel {
	private String private_vari = "this is a variable of private_vari";

	public String accessPrivateVari() {
		return private_vari;
	}

}
