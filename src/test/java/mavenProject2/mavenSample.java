package mavenProject2;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class mavenSample {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\merin\\eclipse-workspace\\applitools-vansahTest\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void googleSearchForIPhone13() {
        driver.get("https://www.google.com");
        System.out.println("Hello");
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("iPhone 13");
        searchInput.sendKeys(Keys.ENTER);
    }

    @AfterClass
    public void tearDown() {
       // driver.quit();
    }
	

}
