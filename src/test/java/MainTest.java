import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest extends TestsCore {

    private String sitename = "https://binomo.com/ru";

    @Test // Тест C1805 открыть главную страницу binomo
    public void test() {
        MainPage mp = new MainPage(driver);
        mp.getSite(sitename);
        Assert.assertTrue(mp.getHeader());
    }
}
