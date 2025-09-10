package in.Shrii;

import java.lang.reflect.Field;

public class Main {
	public static void main(String[] args) throws Exception {
		
//		Car car = new Car(new PetrolEngine());
//		
//		car.SetEng(new DieselEngine());
//		car.drive();
		
		Class<?> clz = Class.forName("in.Shrii.Car");
		Object object = clz.newInstance();
		Car carObj =(Car) object;
		
		Field engField = clz.getDeclaredField("eng");
		engField.setAccessible(true);
		
		engField.set(carObj, new PetrolEngine());
		
		carObj.drive();
	}

}
