package access;

/**
 * 私有变量不可以通过对象+变量名的方式方式，可以通过方法访问
 * 
 * @author tonghuo
 *
 */
public class PrivateRight {
	public static void main(String[] args) {
		PrivateModel p = new PrivateModel();
		String return_vari = p.accessPrivateVari();
		System.out.println(return_vari);
	}

}
