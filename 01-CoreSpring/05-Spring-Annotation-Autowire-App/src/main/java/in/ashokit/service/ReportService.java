package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import in.ashokit.reports.IReport;

@Service
public class ReportService {
	
//	@Autowired
//	@Qualifier("excel")
//	private IReport report;
	
	@Autowired
	@Qualifier("excel")
	private IReport excelreport;
	
	@Autowired
	@Qualifier("pdf")
	private IReport pdfreport;
	
	public void generate() {
//		System.out.println("Injecting :: " +report.getClass().getName());
//		report.generateReport();
		
		System.out.println("Injecting :: " +excelreport.getClass().getName());
		excelreport.generateReport();
		
		System.out.println("Injecting :: " +pdfreport.getClass().getName());
		pdfreport.generateReport();
	}
}
