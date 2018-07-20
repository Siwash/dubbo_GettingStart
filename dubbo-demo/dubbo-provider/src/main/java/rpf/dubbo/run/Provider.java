package rpf.dubbo.run;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {
	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("provider.xml");
		System.out.println(context.getDisplayName()+":here");
		context.start();
		System.out.println("provider is running，a service could been use");
		System.in.read();//阻塞程序，已达到持续运行程序，提供服务
	}
}
