package com.test.innercodedesign.uniquedifferentparam;

/**
 * 唯一差异参数设计： 1.使用条件：代码有两个true/false的执行方向，两个方向除了一个变量不同外其他均相同，
 * 可以先将这个变量设定在false方向上，然后执行判断，根据判断结果修整变量值，最后执行具体的处理逻辑。
 * 2.三段式结构：1.设定在false上；2.判断true是否成立；3.具体执行。
 * 
 * @author tonghuo
 *
 */
public class UniqueDifferentParamModel {
	/*
	 * 为true，加1；false,不加
	 */
	public static int chooseDirection(int oldValue, boolean isAdd) {
		int a = 0;// 设定在false上
		if (isAdd)// 判断true是否成立
			a = 1;

		return oldValue + a;// 具体执行
	}
}
