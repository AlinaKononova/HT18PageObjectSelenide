import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class TestCart {

  @BeforeTest
  public void beforeTest() {
    Configuration.startMaximized = true;
    open("https://rozetka.com.ua/");

  }

  @Test
  public void testCart() {

    new MainPageLogic().clickOnComputersAndLaptops()
            .clickOnLaptops()
            .clickBuyBtn();

    Assert.assertEquals(new CartLogicPage().shoppingCartCountItems(), "1");
    Assert.assertEquals(new CartLogicPage().clickShoppingCart().getTitleOfItemInShoppingCart(), new SearchPageLogic().getTitleOfFirstItem());
  }
}
