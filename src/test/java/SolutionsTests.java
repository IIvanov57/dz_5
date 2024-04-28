import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SolutionsTests {

  static {
    Configuration.pageLoadStrategy = "eager";
  }

  @Test
  void checkEnterprisePage() {

    open("https://github.com/");
    $("ul > li:nth-child(2) > button").hover();
    $("a[href='/enterprise']").click();

    $("#hero-section-brand-heading").shouldHave(text("The AI-powered\n" +
            "developer platform."));


  }

}
