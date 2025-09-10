package in.Shrii.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.Shrii.beans.Car;

public class App {
	public static void main(String[] args) {
		
		//Starting IoC Container
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		
		Car car = context.getBean(Car.class);
		car.drive();
	}

}
