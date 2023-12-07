package guru.qa.tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class SimpleTest extends TestBase {
    @Test
    void simpleTest() {
        open(baseUrl);
        sleep(5000);
    }
}
