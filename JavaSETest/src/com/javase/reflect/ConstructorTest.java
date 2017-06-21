package com.javase.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/**
 * ��Ҫ�����������ʹ���вι��췽��������������Ȼ�ö�Ӧ���вι��췽��
 * 
 * @author tonghuo
 *
 */
public class ConstructorTest {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		try {
			Class c = Class.forName("reflect.ReflectModel");

			Constructor[] constructors = c.getConstructors();// �������Ȩ��Ϊpublic�Ĺ��췽��
			System.out.println("public���͵Ĺ��췽������Ŀ----" + constructors.length);

			String constructor_name = constructors[0].getName();
			System.out.println("constructor_name----" + constructor_name);// ���췽�������Ƽ����ȫ�޶�������

			Constructor c01 = c.getDeclaredConstructor(String.class);
			c01.setAccessible(true);
			ReflectModel obj01 = (ReflectModel) c01.newInstance("name01");
			System.out.println("ͨ��private���췽�������Ķ���----" + obj01.getName());

			Constructor c02 = c.getConstructor(int.class, String.class);
			Class[] parameterTypes = c02.getParameterTypes();
			System.out.println("-----------�������췽���Ĳ�������-----------------");
			for (Class x : parameterTypes)
				System.out.println(x.getSimpleName());

			int modifiers = c02.getModifiers();
			System.out.println("��ȡ���췽�������η�----" + modifiers);
			boolean isPublic = Modifier.isPublic(modifiers);
			System.out.println("���췽����Ȩ�����η�----isPublic----" + isPublic);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
