package rpf.dubbo.customer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import rpf.dubbo.service.DubboStartService;

public class Customer {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("customer.xml");
		System.out.println(context.getDisplayName()+":here");
		context.start();
		System.out.println("customer is running");
		DubboStartService start =context.getBean(DubboStartService.class);
		System.out.println("i get a service!");
		System.out.println(start.MyfirstDistributedService("hello Distrubute"));
	}
}
