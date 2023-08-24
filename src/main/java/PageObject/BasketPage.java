package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class BasketPage {

    public SelenideElement
     FirstProduct = $(byAttribute("href","https://officemart.ge/product/schneider-კალმები/კალამი-ბურთულიანი-შნაიდერი-schneider-tops-ლურჯი")),
     SecondProduct = $(byAttribute("href", "https://officemart.ge/product/schneider-კალმები/კალამი-ბურთულიანი-შნაიდერი-schneider-k15-ასორტირებული-ფერები")),
     AddBasket_Btn = $(byText("კალათაში დამატება")),
     MyBasket_Btn = $(byAttribute("class", "cart_info")),
     ProductIsInBasket = $(byText("პროდუქტი წარმატებით დაემატა კალათაში")),
     ProductColor = $(byAttribute("class", "choose_color")),
     ProductId = $(byAttribute("class", "item_id")),
     ProductQuantity = $(byName("quantity")),
     ProductSum = $(".fullPriceFor"),
     ProductPlus_Btn = $(".fa-plus"),
     ProductMinus_Btn = $(byAttribute("class", "fa fa-minus")),
     ProductDelete_Btn = $(byAttribute("class", "fas fa-times")),
     BasketISEmpty_Txt = $(byText("კალათა ცარიელია")),
     ClearBasket_Btn = $(byAttribute("class", "clear_btn")),
     Continue_Btn = $(byAttribute("class", "continue")),
     ProductPrice = $(".prod_price");


}
