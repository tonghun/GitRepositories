package reflect;

/**
 * 通过反射机制获得的类，只有一个利用无参构造方法创建对象的方法
 * 
 * @author tonghuo
 *
 */
public class BasicReflectTest {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		try {
			Class c = Class.forName("reflect.ReflectModel");// 将类加载到JVM

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

			String allClassName = c.getName();// 全限定性类名
			System.out.println("allClassName----" + allClassName);

			String simpleClassName = c.getSimpleName();// 不包含包名的简单类名
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
