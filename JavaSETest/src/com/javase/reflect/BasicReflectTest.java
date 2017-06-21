package com.javase.reflect;

/**
 * ͨ��������ƻ�õ��ֻ࣬��һ�������޲ι��췽����������ķ���
 * 
 * @author tonghuo
 *
 */
public class BasicReflectTest {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		try {
			Class c = Class.forName("reflect.ReflectModel");// ������ص�JVM

			try {
				ReflectModel newInstance = (ReflectModel) c.newInstance();
				newInstance.toString();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			String allClassName = c.getName();// ȫ�޶�������
			System.out.println("allClassName----" + allClassName);

			String simpleClassName = c.getSimpleName();// �����������ļ�����
			System.out.println("simpleClassName----" + simpleClassName);

			Class superclass = c.getSuperclass();
			System.out.println("superClass----" + superclass.getSimpleName());

			Package package01 = c.getPackage();
			System.out.println("package----" + package01.getName());

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
