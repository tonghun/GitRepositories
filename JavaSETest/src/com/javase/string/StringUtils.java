package com.javase.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

/**
 * 找出字符串中出现次数最多的字符及其出现次数：统计每一个字符的出现次数，找出最大值。
 * 
 * @author tonghuo
 *
 */
public class StringUtils {

	/**
	 * 统计指定字符在字符串中出现次数
	 * 
	 */
	public int occursCount(String sup, String sub) {
		StringBuilder builder = new StringBuilder(sup);
		int len = sub.length();
		int index = 1;
		int count = 0;
		while (index >= 0) {
			index = builder.indexOf(sub);
			if (index >= 0) {
				builder.delete(0, index + len);
				count++;
			}
		}
		return count;
	}

	/**
	 * 找出字符串中出现次数最多的字符及其出现次数
	 * 
	 * @param str
	 */
	public Set<String> findMaxCount(String str) {
		Map<String, Integer> map = new HashMap<String, Integer>();// key为字符，value为出现次数
		Set<String> usedChars = new HashSet<String>();// 收集统计过的字符，避免重复统计

		char[] charArr = str.toCharArray();
		int max = 0;

		/**
		 * 获取了出现次数最大值
		 */
		for (char x : charArr) {
			String temp = String.valueOf(x);
			if (!usedChars.contains(temp)) {
				usedChars.add(temp);
				int count = occursCount(str, temp);
				map.put(temp, count);
				if (max < count)
					max = count;
			}
		}

		Set<String> res = new HashSet<String>();// 以"字符，count"的形式存储结果
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while (it.hasNext()) {
			String c = it.next();
			Integer count = map.get(c);
			if (count == max)
				res.add(c + "," + max);
		}

		return res;
	}

	/**
	 * 测试方法
	 */
	@Test
	public void test01() {
		String str = "111111aaaaaaabb^$";
		Set<String> res = findMaxCount(str);
		for (String x : res) {
			String[] maxStr = x.split(",");
			System.out.println(maxStr[0] + "出现次数最多，共出现了" + maxStr[1] + "次");
		}
	}
}
