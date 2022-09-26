package spring.core.ch02.ex02;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Timer {
	@Pointcut("execution(public * spring.core.ch02.ex02..*(..))")
	private void myPointcut() {}
	
	@Around("myPointcut()")
	public Object clock(ProceedingJoinPoint jp) throws Throwable {
		System.out.println(jp.getSignature());
		
		long start = System.currentTimeMillis();
		Result result = (Result)jp.proceed();
		long end = System.currentTimeMillis();
		
		System.out.println("경과시간: " + (end - start));
		
		result.setResult(result.getResult() + "(clock)"); //이 리절트는 aspect이 가동한?리절트임을 알기위해 clock을 붙임
		return result; 
	}
}
