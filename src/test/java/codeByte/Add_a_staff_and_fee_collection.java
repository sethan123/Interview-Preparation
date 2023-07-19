package codeByte;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Add_a_staff_and_fee_collection {

	WebDriver driver;

	@Test(priority = 0)
	public void login() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://staging3-akes.nexquare.io/nexquare/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.id("txtuser")).sendKeys("S0075");
		driver.findElement(By.id("txtpassword")).sendKeys("Abc!@1");
		driver.findElement(By.xpath("//button[@id='log-btn']")).click();
		System.out.println("Successfully Logged In");

	}

	@Test(alwaysRun = false)
	public void staffAdding() {
		// Click svg
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@class='spinner-outer']"))));
		driver.findElement(By.xpath("//div[@class='sidenav']//button[@type='button']")).click();

		driver.findElement(By.cssSelector("a[id='hr']")).click();
		// Staff Add
		driver.findElement(By.xpath("//li[@id='link_addStaff']//a[@href='addStaff'][normalize-space()='Staff Add']"))
				.click();
		// fullname
		driver.findElement(By.xpath("//input[@id='staffFullName']")).sendKeys("chethan");
		// select the user Type
		// Select userType = new Select(driver.findElement(By.xpath("")));
		// userType.selectByIndex(1);

		// select gender
		driver.findElement(By.id("radio1")).click();
		System.out.println("Selected male gender");

		// select DOB
		driver.findElement(By.id("dob")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// select DOB MOnth
		Select Month = new Select(driver.findElement(By.xpath("//*[@data-handler='selectMonth']")));
		Month.selectByIndex(1);

		// Select DOB Year
		Select Year = new Select(driver.findElement(By.xpath("//*[@data-handler='selectYear']")));
		Year.selectByValue("1999");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Select DOB Date
		driver.findElement(By.xpath("//a[normalize-space()='15']"));
		System.out.println("DOB is filled successfully");

		// select Joining date
		driver.findElement(By.id("joinDate")).click();
		// select Joining MOnth
		Select joinngMonth = new Select(driver.findElement(By.xpath("//*[@data-handler='selectMonth']")));
		joinngMonth.selectByIndex(1);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Select Joining Year
		Select joiningYear = new Select(driver.findElement(By.xpath("//*[@data-handler='selectYear']")));
		joiningYear.selectByValue("2023");

		// Select Joining Date
		driver.findElement(By.xpath("//a[normalize-space()='15']"));
		System.out.println("Joining Date is filled successfully");

		// email
		driver.findElement(By.id("email")).sendKeys("shen@gmail.com");

		// Salary date
		driver.findElement(By.id("salaryStartDate")).click();
		// select Salary MOnth
		Select SalaryMonth = new Select(driver.findElement(By.xpath("//*[@data-handler='selectMonth']")));
		SalaryMonth.selectByIndex(3);

		// Select Salary Year
		Select SalaryYear = new Select(driver.findElement(By.xpath("//*[@data-handler='selectYear']")));
		SalaryYear.selectByValue("2023");

		// Select Salary Date
		driver.findElement(By.xpath("//a[normalize-space()='10']"));
		System.out.println("Salary Date is filled successfully");

		// submit
		driver.findElement(By.id("submitButton")).click();
	}

	@Test(priority = 1)
	public void feeConfiguration() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@class='spinner-outer']"))));
		driver.findElement(By.xpath("//div[@class='sidenav']//button[@type='button']")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@id='wallet_config']")).click();
		System.out.println("Successfully clicked the wallet");
		
		//Search Test box
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement   search =driver.findElement(By.id("searchInput"));
		search.sendKeys("200011313");
		search.sendKeys(Keys.ENTER);
		System.out.println("Succesfully searched");
		
		//select uppaid textbox
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(40));
		wait1.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[2]"))));
		System.out.println("Selected the unpaid check box");
		
		
		//
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
		wait2.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//mat-select[@id='mat-select-18']"))));
		System.out.println("Click Payment mode");
		driver.findElement(By.xpath("//span[normalize-space()='Cash']")).click();
		System.out.println("Paid via cash");
		
		driver.findElement(By.xpath("//span[normalize-space()='Pay']")).click();
		System.out.println("Succesfully Paid");
		
			

	}

	@AfterTest()
	public void tearDown() {
		driver.close();
	}

}
