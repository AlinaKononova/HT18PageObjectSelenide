import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class SearchPageLogic {
  SelenideElement firstItem = $(By.xpath("//span[@class='goods-tile__title']"));
  SelenideElement buyBtn = $(By.xpath("//button[contains(@class, 'buy-button')]"));

  public String getTitleOfFirstItem() {
    return firstItem.text().trim();
  }

  public SearchPageLogic clickBuyBtn() {
    buyBtn.click();
    return this;
  }

}
