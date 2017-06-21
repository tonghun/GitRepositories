package regex;

/**
 * 正则表达式的用法
 * 
 * @author tonghuo
 *
 */
public class RegexTest01 {
	public static void main(String[] args) {
		String regex = "^1[357]\\d{9}";
		String s01 = "13838690418";
		boolean matching = s01.matches(regex);
		System.out.println("是否匹配----" + matching);
	}

}
