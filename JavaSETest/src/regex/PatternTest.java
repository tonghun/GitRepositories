package regex;

import java.util.regex.Pattern;

/**
 * Pattern没有提供构造方法，通常调用其中的静态方法matches(String regex,String
 * s)来判读字符串是否匹配
 * 
 * @author tonghuo
 *
 */

public class PatternTest {

	public static void main(String[] args) {
		String regex = "^1@\\p{Lower}{3}\\.com$";
		String s = "1@sdd.com";
		boolean matching = Pattern.matches(regex, s);
		System.out.println("是否匹配----" + matching);
	}

}
