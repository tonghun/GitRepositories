package com.javase.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * ͨ��������Ʒ��ʼ��ص�JVM�е���ķ���������ͨ��������ƻ�÷�����ѭ�������õĻ���ԭ��----ͨ��������ã�
 * ����ڵ���ǰ�����ȴ�������
 * 
 * @author tonghuo
 *
 */
public class MethodTest {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		try {
			Class c = Class.forName("reflect.ReflectModel");
			Method m01 = c.getDeclaredMethod("doit02", int.class, String.class);// ֻ�и��ݷ���������������������أ�����Ψһȷ������

			int modifiers = m01.getModifiers();
			System.out.println("modifiers----" + Modifier.isPrivate(modifiers));

			Class returnType = m01.getReturnType();
			System.out.println("����ֵ����----" + returnType);

			String name = m01.getName();
			System.out.println("������----" + name);

			Class[] parameterTypes = m01.getParameterTypes();
			System.out.println("-----------------�����Ĳ�������----------------");
			for (Class x : parameterTypes)
				System.out.println(x.getName());

			ReflectModel obj = (ReflectModel) c.newInstance();
			m01.invoke(obj, 1, "m01");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
