package in.codegram.springjdbcdemo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicatironTest {

	public static void main(String[] args) {
		ApplicationContext  ctx = new ClassPathXmlApplicationContext("resource/beans.xml");
		System.out.println(ctx);

	}

}
