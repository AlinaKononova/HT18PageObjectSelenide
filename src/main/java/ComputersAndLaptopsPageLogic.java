import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class ComputersAndLaptopsPageLogic {
  SelenideElement laptopsLink = $(By.xpath("//div[@class='tile-cats']"));

  public SearchPageLogic clickOnLaptops() {
    laptopsLink.click();
    return page(SearchPageLogic.class);
  }
}
