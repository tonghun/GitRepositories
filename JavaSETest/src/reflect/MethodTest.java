package reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * 通过反射机制访问加载到JVM中的类的方法，调用通过反射机制获得方法遵循方法调用的基本原则----通过对象调用，
 * 因此在调用前必须先创建对象。
 * 
 * @author tonghuo
 *
 */
public class MethodTest {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		try {
			Class c = Class.forName("reflect.ReflectModel");
			Method m01 = c.getDeclaredMethod("doit02", int.class, String.class);// 只有根据方法名与参数类型两个因素，才能唯一确定方法

			int modifiers = m01.getModifiers();
			System.out.println("modifiers----" + Modifier.isPrivate(modifiers));

			Class returnType = m01.getReturnType();
			System.out.println("返回值类型----" + returnType);

			String name = m01.getName();
			System.out.println("方法名----" + name);

			Class[] parameterTypes = m01.getParameterTypes();
			System.out.println("-----------------方法的参数类型----------------");
			for (Class x : parameterTypes)
				System.out.println(x.getName());

			ReflectModel obj = (ReflectModel) c.newInstance();
			m01.invoke(obj, 1, "m01");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
