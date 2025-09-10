package in.Shrii;

public class Car {
	
	private IEngine eng;//Default Value is Null
	
//	public Car(IEngine eng) {
//		this.eng = eng; 
//	}
//	
//	public void SetEng(IEngine eng) {
//		this.eng = eng; 
//	}
	
	
	public void drive() {
		int start = eng.start(); // java.lang.NullPointerException
		
		if(start >=1) {
			System.out.println("Journey Satated....");
		}
		else {
			System.out.println("Engine in trouble...");
		}
	}

}
