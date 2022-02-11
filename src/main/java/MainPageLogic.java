import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class MainPageLogic {
  SelenideElement computerAndLaptopsLink = $(By.xpath("//a[@class='menu-categories__link']"));

  public ComputersAndLaptopsPageLogic clickOnComputersAndLaptops() {
    computerAndLaptopsLink.click();
    return page(ComputersAndLaptopsPageLogic.class);
  }

}
