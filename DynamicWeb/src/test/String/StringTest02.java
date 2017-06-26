package test.String;

/**
 * 
 * @author tonghuo
 * 
 *         1.+不能用作分割符，;不能用作分割符
 */
public class StringTest02 {
	public static void main(String[] args) {
		String s = "admin,123";
		System.out.println(s);
		String[] sArr = s.split(",");
		System.out.println(sArr[0]);
		System.out.println(sArr[1]);
	}

}
