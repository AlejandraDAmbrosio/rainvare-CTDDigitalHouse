/**
SearchPage Class - @author Rainvare - Parcial Testing II - CTD
 **/

package Pages;
import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class SearchPage extends BasePage{

    // Searchs - xpaths
    private static final String searchBox = "/html/body/header/div/div/div[2]/div/input";

    private static final String clickSearch = "/html/body/header/div/div/div[2]/div/span/button/i";

    private static final String addProductcart = "/html/body/div[2]/div/div/div[3]/div/div/div[2]/div[2]/button[1]/i";

    private static final String productMessage = "/html/body/div[2]/div[1]";

    public void addProduct(String iphone) throws InterruptedException{
        WebElement first = driver.findElement(By.xpath(searchBox));
        first.click();
        first.sendKeys(iphone);

        WebElement second = driver.findElement(By.xpath(clickSearch));
        second.click();
        Thread.sleep(400);

        WebElement third = driver.findElement(By.xpath(addProductcart));
        third.click();
        Thread.sleep(400);

        WebElement finaly = driver.findElement(By.xpath(productMessage));
        finaly.getText().contains("Success: You have added iPhone to your shopping cart!");
        //"Éxito: ¡ha añadido el iPhone a su cesta de la compra!
        Thread.sleep(1500);
    }




}
