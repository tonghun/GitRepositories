package el;

public class StringDeal {
	public static String shiftEnter(String str) {
		String newStr = str.replace("\r\n", "<br>");
		newStr = newStr.replaceAll("", "&nbsp;");
		System.out.println(newStr);
		return newStr;
		// return str;
	}
}
