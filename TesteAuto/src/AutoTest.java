import org.openqa.selenium.chrome.ChromeDriver;

public class AutoTest {
    public static void main(String[] args){
        // Initial config
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAFAEL\\Downloads\\SambaTech\\TesteAuto\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        LoginPage loginPage = new LoginPage(driver);

        // Navigate to the login page
        loginPage.access("http://web1.qa.sambatech.com:10000/auth/login?redirect=settings/encodingSettings");

        // Try to access the Know Sambatech videos
        loginPage.knowSambaLink();

        // Wrong login/password combinations
        loginPage.doLogin("admin","123456789");
        loginPage.doLogin("avaliacao_qa_samba@sambatech.com.br","987654321");
        loginPage.doLogin("admin","admin");

        // Correct login in the application
        loginPage.doLogin("avaliacao_qa_samba@sambatech.com.br","123456789");

        //To close the test and close the browser pages in the same time, just remove the comment below
        //driver.quit();

    }
}
