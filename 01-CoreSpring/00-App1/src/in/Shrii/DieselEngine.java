package in.Shrii;

public class DieselEngine implements IEngine{

	@Override
	public int start() {
		System.out.println("Diesel Engine Started");
		return 1;
	}

}
