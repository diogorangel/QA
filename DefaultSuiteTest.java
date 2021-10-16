// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class DefaultSuiteTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void cT01ValidarLayout() {
    driver.get("https://inoveteste.com.br/");
    driver.manage().window().setSize(new Dimension(1382, 784));
    driver.findElement(By.cssSelector("#nav-menu-item-5643 font > font")).click();
    assertThat(driver.findElement(By.cssSelector("h1 font > font")).getText(), is("Contact"));
    {
      List<WebElement> elements = driver.findElements(By.name("nome"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.name("email"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.name("assunto"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.name("mensagem"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("div:nth-child(5) .wpcf7-form-control"));
      assert(elements.size() > 0);
    }
  }
  @Test
  public void cT03EnviarMensagem() {
    driver.get("https://inoveteste.com.br/");
    js.executeScript("window.scrollTo(0,0)");
    driver.findElement(By.cssSelector("#nav-menu-item-5643 font:nth-child(1) > font:nth-child(1) > font:nth-child(1) > font:nth-child(1) > font:nth-child(1) > font:nth-child(1)")).click();
    driver.findElement(By.name("nome")).sendKeys("´Jordan Lamburg");
    driver.findElement(By.name("email")).sendKeys("Bytedojan@pou.com.br");
    driver.findElement(By.name("assunto")).click();
    driver.findElement(By.name("mensagem")).click();
    driver.findElement(By.name("mensagem")).sendKeys("show");
    driver.findElement(By.cssSelector(".qodef-content-aligment-left .qodef-section-inner-margin")).click();
    driver.findElement(By.cssSelector("div:nth-child(5) .wpcf7-form-control")).click();
  }
  @Test
  public void cT202ValidarCriticaCampos() {
    driver.get("https://inoveteste.com.br/");
    driver.findElement(By.cssSelector("#nav-menu-item-5643 .item_inner")).click();
    js.executeScript("window.scrollTo(0,106)");
    js.executeScript("window.scrollTo(0,764)");
    driver.findElement(By.cssSelector("div:nth-child(5) > center:nth-child(1) .wpcf7-form-control:nth-child(1)")).click();
    js.executeScript("window.scrollTo(0,888)");
    assertThat(driver.findElement(By.cssSelector(".nome font > font > font > font > font > font")).getText(), is("Please fill in the required field."));
    assertThat(driver.findElement(By.cssSelector(".email font > font > font > font > font > font")).getText(), is("Please fill in the required field."));
    assertThat(driver.findElement(By.cssSelector(".assunto font > font > font > font > font > font")).getText(), is("Please fill in the required field."));
    assertThat(driver.findElement(By.cssSelector(".mensagem font > font > font > font > font > font")).getText(), is("Please fill in the required field."));
    assertThat(driver.findElement(By.cssSelector(".wpcf7-response-output > font > font:nth-child(1) > font > font > font > font")).getText(), is("Validation errors occurred."));
  }
}
