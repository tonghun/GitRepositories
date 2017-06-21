package regex;

import java.util.regex.Pattern;

import org.junit.Test;

/**
 * 在正则表达式中可以使用“|”来连接多个表达式形式，只要满足其中一种，即为true。
 * 
 * @author tonghuo
 *
 */
public class Or {
	@Test
	public void testOr() {
		String regex = "^a.*|^b.*";
		String target = "bbc";
		boolean matches = Pattern.matches(regex, target);
		System.out.println(matches);
	}

}
