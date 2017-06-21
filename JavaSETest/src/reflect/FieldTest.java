package reflect;

import java.lang.reflect.Field;

/**
 * 访问成员变量的目的：获取指定对象中变量的值、为指定对象中变量赋值，即取值与赋值。
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
			System.out.println("获取变量的值----" + name_field.get(obj));

			name_field.set(obj, "name_obj01");
			System.out.println("获取变量的值----" + name_field.get(obj));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
