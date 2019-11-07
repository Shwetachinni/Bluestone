package Generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Generic_screenshot {
 
	public static void get_Photo(WebDriver driver) throws IOException
	{
		String pic="./Screenshot/";
		Date d=new Date();
		String d1=d.toString();
		String date=d1.replaceAll(":","-");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(pic+date+".jpeg");
		FileUtils.copyFile(src,dst);
		
	}
}
