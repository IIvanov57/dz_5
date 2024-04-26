import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTests {

  @BeforeAll
  static void beforeAll() {
    baseUrl = "https://the-internet.herokuapp.com/drag_and_drop";
  }

  @Test
  void moveRectangleTest() {
    open(baseUrl);

    SelenideElement elementA = $("#column-a");
    SelenideElement elementB = $("#column-b");
    actions().clickAndHold(elementA).moveToElement(elementB).release().perform();

    $("#column-a").shouldHave(text("B"));
    $("#column-b").shouldHave(text("A"));

  }

  @Test
  void moveRectangleWithDragAndDropActionsTest() {
    open(baseUrl);
    SelenideElement elementA = $("#column-a");
    SelenideElement elementB = $("#column-b");
    actions().dragAndDrop(elementA, elementB).perform();

    $("#column-a").shouldHave(text("B"));
    $("#column-b").shouldHave(text("A"));

  }
}
