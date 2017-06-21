package com.javase.reflect;

import java.lang.reflect.Field;

/**
 * ���ʳ�Ա������Ŀ�ģ���ȡָ�������б�����ֵ��Ϊָ�������б�����ֵ����ȡֵ�븳ֵ��
 * 
 * @author tonghuo
 *
 */
public class FieldTest {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		try {
			Class c = Class.forName("reflect.ReflectModel");
			ReflectModel obj = (ReflectModel) c.newInstance();
			obj.setName("name_obj");

			Field[] declaredFields = c.getDeclaredFields();
			for (Field x : declaredFields)
				System.out.println(x.getName());

			Field name_field = c.getField("name");
			System.out.println("��ȡ������ֵ----" + name_field.get(obj));

			name_field.set(obj, "name_obj01");
			System.out.println("��ȡ������ֵ----" + name_field.get(obj));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
