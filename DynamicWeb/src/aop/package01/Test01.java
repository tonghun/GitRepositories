package aop.package01;

import org.aopalliance.aop.Advice;
import org.springframework.aop.framework.ProxyFactory;

public class Test01 {
	public static void main(String[] args) {
		Target target = new Target();
		ProxyFactory factory = new ProxyFactory();
		factory.addAdvice(new LoggerExecute());
		factory.setTarget(target);
		Target proxy = (Target) factory.getProxy();
		proxy.execute("AOP的简单实现");
	}

}
