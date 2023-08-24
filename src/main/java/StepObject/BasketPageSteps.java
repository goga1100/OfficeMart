package StepObject;

import PageObject.BasketPage;
import io.qameta.allure.Step;
import org.testng.Assert;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;

public class BasketPageSteps extends BasketPage {

    @Step(" Add product in basket")
    public BasketPageSteps AddInBasket1() {

    FirstProduct.click();
    AddBasket_Btn.click();
    ProductIsInBasket.shouldBe(visible, Duration.ofMillis(5000));

        return this;
    }

    @Step(" Add product in basket")
    public BasketPageSteps AddInBasket2() {

        SecondProduct.click();
        AddBasket_Btn.click();
        ProductIsInBasket.shouldBe(visible, Duration.ofMillis(5000));

        return this;
    }

    @Step(" Checking if product name is visible")
    public BasketPageSteps ProductNameCheck() {

    MyBasket_Btn.click();
    FirstProduct.shouldBe(visible, Duration.ofMillis(3000));

        return this;
    }

    @Step(" Checking if product Color is visible")
    public BasketPageSteps ProductColorCheck() {

        MyBasket_Btn.click();
        ProductColor.shouldBe(visible, Duration.ofMillis(3000));

        return this;
    }

    @Step(" Checking if product Color is visible")
    public BasketPageSteps ProductIdCheck() {

        MyBasket_Btn.click();
        ProductId.shouldBe(visible, Duration.ofMillis(3000));

        return this;
    }

    @Step(" Checking if product Color is visible")
    public BasketPageSteps ProductQuantityCheck() {

        MyBasket_Btn.click();
        ProductQuantity.shouldBe(visible, Duration.ofMillis(3000));

        return this;
    }

    @Step(" Checking if product Color is visible")
    public BasketPageSteps ProductPriceCheck() {

        MyBasket_Btn.click();
        ProductPrice.shouldBe(visible, Duration.ofMillis(3000));

        return this;
    }

    @Step(" Checking if product Color is visible")
    public BasketPageSteps ProductSumCheck() {

        MyBasket_Btn.click();
        ProductSum.shouldBe(visible, Duration.ofMillis(3000));

        return this;
    }

    @Step("I increased the quantity and compared that the sum is equal to the quantity multiplied by the price")
    public BasketPageSteps BasketCountPlus(){
        MyBasket_Btn.click();
        ProductPlus_Btn.click();
        String priceL = ProductPrice.getText().replaceAll("[^\\d.]", "");
        String countL = ProductQuantity.getValue();
        String summ = ProductSum.getText().replaceAll("[^\\d.]", "");
        float sum = Float.parseFloat(summ);
        int count = Integer.parseInt(countL);
        float price = Float.parseFloat(priceL);
        System.out.println(count);
        System.out.println(sum);
        System.out.println(price);
        Assert.assertTrue(count > 1);
        Assert.assertEquals((count * price), sum, "ჯამი ტოლია რაოდენობა გამრავლებული ფასზე");
        return this;
    }

    @Step("I reduced the quantity and compared that the sum is equal to the quantity multiplied by the price")
    public BasketPageSteps BasketCountMinus(){
        MyBasket_Btn.click();
        ProductPlus_Btn.doubleClick().click();
        ProductMinus_Btn.click();
        String priceL = ProductPrice.getText().replaceAll("[^\\d.]", "");
        String countL = ProductQuantity.getValue();
        String summ = ProductSum.getText().replaceAll("[^\\d.]", "");
        float sum = Float.parseFloat(summ);
        int count = Integer.parseInt(countL);
        float price = Float.parseFloat(priceL);
        System.out.println(count);
        System.out.println(sum);
        System.out.println(price);
        Assert.assertTrue(count > 1);
        Assert.assertEquals((count * price), sum, "ჯამი ტოლია რაოდენობა გამრავლებული ფასზე");
        return this;
    }

    @Step("deleting product from basket")
    public BasketPageSteps DeleteProduct(){
        MyBasket_Btn.click();
        ProductDelete_Btn.click();
        MyBasket_Btn.click();
        BasketISEmpty_Txt.shouldBe(visible, Duration.ofMillis(3000));
        return this;
    }

    @Step("Clearing all products from basket")
    public BasketPageSteps ClearProduct(){
        MyBasket_Btn.click();
        ClearBasket_Btn.click();
        BasketISEmpty_Txt.shouldBe(visible, Duration.ofMillis(3000));
        return this;
    }

    @Step("clicking continuous Button")
    public BasketPageSteps ContinuousBtnCheck(){
        MyBasket_Btn.click();
        Continue_Btn.click();
        return this;
    }

}
