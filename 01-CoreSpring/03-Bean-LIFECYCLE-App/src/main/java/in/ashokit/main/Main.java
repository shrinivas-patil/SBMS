package in.ashokit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.bean.Motor;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean-Cycle.xml");
		
		Motor motor = context.getBean(Motor.class);
		
		motor.doWork();
		
		ConfigurableApplicationContext cfgtxt = (ConfigurableApplicationContext)context;
		cfgtxt.registerShutdownHook();
	}

}
