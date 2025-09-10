package in.Shrii.beans;

//public class Car {
//	
//	private IEngine eng;
//	
////	public Car() {
////		System.out.println("Car :: Zero-Param-Constructor");
////	}
////	
////	public Car(IEngine eng) {
////		System.out.println("Car ::Param-Constructor");
////		this.eng = eng;
////	}
//	
//	public void setEng(IEngine eng) {
//		System.out.println("setEng( ) method Called...");
//		this.eng = eng;
//	}
//	
//	public void drive() {
//		int status = eng.start();
//		if(status >= 1) {
//			System.out.println("Jorney Started. . .");
//		} else {
//			System.out.println("Engine Trouble. . .");
//		}
//		
//	}
//
//}
public class Car {

	private IEngine eng;

	public Car(IEngine eng) {
		this.eng = eng;
	}

	public void drive() {
		int status = eng.start();

		if (status >= 1) {
			System.out.println("Journey Started..");
		} else {
			System.out.println("Engine Trouble");
		}
	}
}

