package aop.package01;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggerExecute implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		// TODO Auto-generated method stub
		before();
		arg0.proceed();
		after();
		return null;
	}

	private void before() {
		// TODO Auto-generated method stub
		System.out.println("����ʼִ��");
	}

	private void after() {
		System.out.println("����ִ�н���");
	}

}
