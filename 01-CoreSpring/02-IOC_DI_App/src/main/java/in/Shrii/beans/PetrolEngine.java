package in.Shrii.beans;

public class PetrolEngine implements IEngine{
	

	public PetrolEngine() {
		System.out.println("PetrolEngine :: Constructor");
	}

	@Override
	public int start() {
		System.out.println("Petrol Engine Started");
		return 1;
	}

}
