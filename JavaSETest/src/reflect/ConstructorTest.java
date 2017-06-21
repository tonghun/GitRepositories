package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/**
 * 想要借助反射机制使用有参构造方法创建对象必须先获得对应的有参构造方法
 * 
 * @author tonghuo
 *
 */
public class ConstructorTest {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		try {
			Class c = Class.forName("reflect.ReflectModel");

			Constructor[] constructors = c.getConstructors();// 获得所有权限为public的构造方法
			System.out.println("public类型的构造方法的数目----" + constructors.length);

			String constructor_name = constructors[0].getName();
			System.out.println("constructor_name----" + constructor_name);// 构造方法的名称即类的全限定性类名

			Constructor c01 = c.getDeclaredConstructor(String.class);
			c01.setAccessible(true);
			ReflectModel obj01 = (ReflectModel) c01.newInstance("name01");
			System.out.println("通过private构造方法创建的对象----" + obj01.getName());

			Constructor c02 = c.getConstructor(int.class, String.class);
			Class[] parameterTypes = c02.getParameterTypes();
			System.out.println("-----------遍历构造方法的参数类型-----------------");
			for (Class x : parameterTypes)
				System.out.println(x.getSimpleName());

			int modifiers = c02.getModifiers();
			System.out.println("获取构造方法的修饰符----" + modifiers);
			boolean isPublic = Modifier.isPublic(modifiers);
			System.out.println("构造方法的权限修饰符----isPublic----" + isPublic);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
