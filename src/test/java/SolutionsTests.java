import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SolutionsTests {


  @Test
  void checkEnterprisePage() {

    open("https://github.com/");
    $("ul > li:nth-child(2) > button").hover();
    sleep(3000);
    $("a[href='/enterprise']").click();

    $("#hero-section-brand-heading").shouldHave(text("The AI-powered\n" +
            "developer platform."));


  }

}
