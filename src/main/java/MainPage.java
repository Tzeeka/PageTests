import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class MainPage {

    WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    private String header = ".tagline";

    MainPage getSite(String sitename) {
        driver.get(sitename);
        return this;
    }

    public boolean getHeader() {
        try {
            driver.findElement(By.cssSelector(header));
        }
        catch (NoSuchElementException e) {
            System.out.println("не найден элемент header");
            return false;
        }
        return true;
    }
}
