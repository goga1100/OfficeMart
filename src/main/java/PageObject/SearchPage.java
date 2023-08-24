package PageObject;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.*;

public class SearchPage {
    public SelenideElement
        SearchProduct_Btn = $(byText("პროდუქტის ძიება")),
        SearchField = $(byAttribute("name", "search")),
        Search_Btn = $(byAttribute("class", "search_button")),
        DataNotFound = $(byText("ვერაფერი მოიძებნა"));

    public ElementsCollection
            ProductNameCollection = $$(byAttribute("class", "prod_title"));



}