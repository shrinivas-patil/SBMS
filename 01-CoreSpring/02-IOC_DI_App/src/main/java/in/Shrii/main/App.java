package in.Shrii.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.Shrii.beans.Car;
import in.Shrii.beans.PetrolEngine;

public class App {
	public static void main(String[] args) {
		
		//Outdated now not using this one
		//BeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));

//		Starting IoC Container
		ApplicationContext context = new ClassPathXmlApplicationContext("Beam.xml");
		Car bean = context.getBean(Car.class);
		bean.drive();
		
		
		//For Prototype check
		/*ApplicationContext context = new ClassPathXmlApplicationContext("Beam.xml");
		
		PetrolEngine pe1 = context.getBean(PetrolEngine.class);
		System.out.println(pe1.hashCode());
		
		PetrolEngine pe2 = context.getBean(PetrolEngine.class);
		System.out.println(pe2.hashCode());
		
		PetrolEngine pe3 = context.getBean(PetrolEngine.class);
		System.out.println(pe3.hashCode());*/
	}

}
