package com.kkuk.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//MyCalculator myCalculator = new MyCalculator();
		//Calculator calculator = new Calculator();
		
		//myCalculator.setCalculator(calculator); // 멤버변수(멤버객체)인 calculator를 외부에서 객체를 생성하여 초기화 -> DI
		
		//myCalculator.addition();
	
		//MyCalculator myCalculator2 = new MyCalculator(calculator);
		//myCalculator2.subtraction();
		
		
		String configLocation = "classpath:applicationCTX.xml";
		// 스프링 컨테이너인 applicationCTX.xml(설정파일) 을 로드하라 (불러와라)
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		// ctx 라는 이름으로 컨테이너 생성
		
		MyCalculator myCalculator = ctx.getBean("myCalculator", MyCalculator.class);
		//스프링 컨테이너에서 객체를 가져옴 -> DI
		
		myCalculator.addition();
		
	}

}
