package gitsele2;


	

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class GitSele2 {
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	System.setProperty("webdriver.gecko.driver","C:\\Users\\radhakrishnan\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https:\\www.facebook.com");
	
		}

}
