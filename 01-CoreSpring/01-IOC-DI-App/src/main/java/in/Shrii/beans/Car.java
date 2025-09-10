package in.Shrii.beans;

public class Car {
	
	private IEngine eng;
	
	public Car() {
	}
	
	public Car(IEngine eng) {
		System.out.println("Car :: Constructor");
		this.eng = eng;
	}
	
	public void setEng(IEngine eng) {
		System.out.println("setEng( ) method Called...");
		this.eng = eng;
	}
	
	public void drive() {
		int status = eng.start();
		if(status >= 1) {
			System.out.println("Jorney Started. . .");
		} else {
			System.out.println("Engine Trouble. . .");
		}
		
	}

}
