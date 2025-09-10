package in.ashokit.reports;

import org.springframework.stereotype.Component;

@Component("excel")
public class ExcelRepository implements IReport{

	@Override
	public void generateReport() {
		System.out.println("ExcelReport Generated...");
		
	}

}
