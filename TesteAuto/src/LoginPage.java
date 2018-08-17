import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {
    private  WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage access(String url){
        driver.get(url);
        return this;
    }

    public void doLogin(String userName, String userPassword){
        driver.findElement(By.name("j_username")).clear();
        driver.findElement(By.name("j_username")).sendKeys(userName);
        driver.findElement(By.name("j_password")).clear();
        driver.findElement(By.name("j_password")).sendKeys(userPassword);
        driver.findElement(By.id("login")).click();
    }

    public void knowSambaLink(){
        WebElement element = driver.findElement(By.id("know-samba"));
        element.click();
    }
}
