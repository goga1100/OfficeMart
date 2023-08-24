package StepObject;

import PageObject.SearchPage;
import io.qameta.allure.Step;
import org.testng.Assert;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;


public class SearchPageSteps extends SearchPage {

    @Step(" click to search button")
    public SearchPageSteps SearchBtn() {

    SearchProduct_Btn.click();
    SearchField.shouldBe(visible, Duration.ofMillis(2000));

        return this;
    }

    @Step(" search correct or incorrect data")
    public SearchPageSteps SearchData(String Data) {

        SearchField.click();
        SearchField.setValue(Data);
        Search_Btn.click();

        return this;
    }

    @Step("The names of the returned data must contain the word passed in the search")
    public SearchPageSteps DataNameIncludes(String name) {

        int productElementsCount = ProductNameCollection.size();

        for(int i = 0; i < productElementsCount; i++){
            String productName = ProductNameCollection.get(i).getText().trim();
            System.out.println(productName);
            Assert.assertTrue(productName.contains(name));
        }

        return this;
    }
}
