package extent;

import java.io.File;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentManager {
	
	
	public ExtentReports getExtentReports() 
	{
		
		String reportPath = System.getProperty("user.dir") + "/reports/extent-report.html";
		
		File reportsFolder = new File(System.getProperty("user.dir") + "/reports");
		
		
		if (!reportsFolder.exists()) //! = not
		{
			reportsFolder.mkdirs();
		}
		
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(reportPath);
		reporter.config().setReportName("Automation Test Result");
		reporter.config().setDocumentTitle("My Test Report");
		
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("tester", "Akshita");
		
		
		return extent;
	}

}
