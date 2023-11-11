
package module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Set the path to the ChromeDriver executable
        //System.setProperty("webdriver.chrome.driver", "D://Automation");
		
        
        System.setProperty("webdriver.chrome.driver", 
        		"D:\\Automation\\chromedriver-win64\\chromedriver.exe");
        
        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        // Navigate to the desired URL
        driver.get("https://google.com");
        
     // Introduce a 3-second delay using Thread.sleep()
        try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        // Close the browser when done
        driver.quit();

	}

}
