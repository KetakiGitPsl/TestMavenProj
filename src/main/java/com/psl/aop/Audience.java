package com.psl.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	
	@Pointcut(value="execution(* com.psl.aop.Performer.perform(..))")
	public void dummy(){
		
	}
	
	@Before(value="dummy()")
	public void audienceTakeSeats(){
		System.out.println("audience Take Seats");
	}
	
	@Before(value="dummy()")
	public void switchOffPhones(){
		System.out.println("audience switch Off Phones");
	}
	
	@AfterThrowing(value="dummy()")
	public void demandRefund(){
		System.out.println("Boo....Audience demand refund");
	}
	
	public void applaud(){
		System.out.println("Audience applaud ..... CLAP CLAP");
	}
	
	public void goHome(){
		System.out.println("Audience go Home");
	}
	
	public void watchPerformance(ProceedingJoinPoint jp){
		System.out.println("audience Take Seats");
		System.out.println("audience switch Off Phones");
		
		//start stop watch
		try {
			jp.proceed(); //gives control to pointcut method
		} catch (Throwable e) {
			System.out.println("Boo....Audience demand refund");
		}
		
		//stop the stop watch 
		System.out.println("Audience applaud ..... CLAP CLAP");
		System.out.println("Audience go Home");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
