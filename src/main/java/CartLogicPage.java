import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;


public class CartLogicPage {
  SelenideElement shoppingCart = $(By.xpath("//button[contains(@class, 'header__button--active')]"));
  SelenideElement titleOfItemInShoppingCart = $(By.xpath("//a[@class='cart-product__title']"));


  public String shoppingCartCountItems() {
    return shoppingCart.attr("innerText").trim();
  }

  public CartLogicPage clickShoppingCart() {
    shoppingCart.click();
    return page(CartLogicPage.class);
  }

  public String getTitleOfItemInShoppingCart() {
    titleOfItemInShoppingCart.shouldBe(Condition.visible);
    return titleOfItemInShoppingCart.text().trim();
  }
}
