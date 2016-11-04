package com.chanroc.springboot.ch1.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 运行主方法
 * Main
 *
 * @author ChenGuop
 * @date 2016/11/4
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
		DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
		DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
		demoAnnotationService.add();
		demoMethodService.add();
		context.close();
	}
}
